package com.moutimid.sqlapp.activities;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.fxn.stash.Stash;

import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class NetworkTask extends AsyncTask<List<String>, Void, Boolean> {
    private Activity mContext;

    public NetworkTask(Activity context) {
        mContext = context;
    }

    @Override
    protected Boolean doInBackground(List<String>... imageUriLists) {
        try {
            final String username = "arbkan05@gmail.com";
            final String password = "trmjndgxgbjvfegj";
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });
            String storedDocumentTitle = Stash.getString("documentTitle", "");
            String storedCountryDocument = Stash.getString("countryDocument", "");
            String storedDocumentNumber = Stash.getString("documentNumber", "");
            String storedExpireDate = Stash.getString("expireDate", "");
            String storedIssuedBy = Stash.getString("issuedBy", "");
            String storedIssuedDate = Stash.getString("issuedDate", "");
            String storedNote = Stash.getString("note", "");
            String storedDocumentType = Stash.getString("documentType", "");
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("arbkan05@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(Stash.getString("email")));
            message.setSubject(Stash.getString("name"));

            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent("<p>" + Stash.getString("message") + "<br>" +
                            "<b>" + storedDocumentTitle + "</b><br>" +
                            "<b>Type:  </b>" + storedDocumentType + "<br>" +
                            "<b>Number:  </b> " + storedDocumentNumber + "<br>" +
                            "<b>Issue Date:  </b>" + storedIssuedDate + "<br>" +
                            "<b>Expire Date:  </b>" + storedExpireDate + "<br>" +
                            "<b>Issued by:  </b>" + storedIssuedBy + "<br>" +
                            "<b>Country of issue:  </b>" + storedCountryDocument + "</p>" +
                            "<b>Note:</b>  " + storedNote + "<br>",
                    "text/html");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            for (int i = 0; i < imageUriLists.length; i++) {

                Log.e("SendEmailTask", "sending image" + imageUriLists[i].get(i).toString() + "  ");
                MimeBodyPart attachmentBodyPart = new MimeBodyPart();
                try {
                    DataSource source = new FileDataSource(imageUriLists[i].get(i).toString());
                    attachmentBodyPart.setDataHandler(new DataHandler(source));
                    attachmentBodyPart.setFileName("image.jpg");
                    // Change the file name as needed
                    multipart.addBodyPart(attachmentBodyPart);
                } catch (Exception e) {
                    Log.e("SendEmailTask", "Error sending image", e);
                }
            }

            message.setContent(multipart);
            Transport.send(message);
            return true;
        } catch (Exception e) {
            Log.e("SendEmailTask", "Error sending email", e);
            return false;
        }
    }

    @Override
    protected void onPostExecute(Boolean result) {
        if (result) {
            // Email sent successfully, show success toast
            Toast.makeText(mContext, "Email sent successfully!", Toast.LENGTH_SHORT).show();
            mContext.finish();
        } else {
            // Error sending email, show error toast
            Toast.makeText(mContext, "Something went wrong, Please try again later", Toast.LENGTH_SHORT).show();
        }
        // You can also finish the activity here if needed
        // SendActivity.activity.finish();
    }
}
