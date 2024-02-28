package com.moutimid.sqlapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fxn.stash.Stash;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.Iteneraries.ItenerariesDetails;
import com.moutimid.sqlapp.model.BeacModel;

public class ItenerariesAdapter extends BaseAdapter {

    private Context context;
    private String[] itemTexts;
    private String[] itemName;
    private String[] itemDetails;
    private int[] itemImages;

    public ItenerariesAdapter(Context context, String[] itemName, String[] itemDetails, String[] itemTexts, int[] itemImages) {
        this.context = context;
        this.itemTexts = itemTexts;
        this.itemImages = itemImages;
        this.itemDetails = itemDetails;
        this.itemName = itemName;
    }
    @Override
    public int getCount() {
        return itemTexts.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.iteneraies_layout, parent, false);
        ImageView imageView = itemView.findViewById(R.id.imageView);
        TextView textView = itemView.findViewById(R.id.textView);
        TextView textView1 = itemView.findViewById(R.id.textView1);
        TextView textView2 = itemView.findViewById(R.id.textView2);
        ImageView map = itemView.findViewById(R.id.map);
        imageView.setImageResource(itemImages[position]);
        textView.setText(itemName[position]);
        textView1.setText(itemTexts[position]);
        textView2.setText(itemDetails[position]);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                if (Stash.getString("iterneraries_type").equals("Day1")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.port_louis_3;
                        model.text1 = "Le Caudan Waterfront is as a prominent commercial development in Port Louis, the capital city of Mauritius, offering a diverse array of amenities such as shops, banking facilities, casinos, cinemas, restaurants, a marina, and the renowned five-star hotel, Le Labourdonnais.<br>" + "<b>Historical Roots:</b><br>" + "The name \"Le Caudan Waterfront\" pays homage to Jean Dominique Michel de Caudan, a notable figure who arrived in the former Isle de France from Languedoc, a historical province in the South of France, in 1726. He initiated a saltpan near a small bay in the southwest of Port-Louis, now recognized as the Robert Edward Hart Garden, situated on the entrance road to Le Caudan Waterfront.<br>" + "The peninsula of Le Caudan, formed around a fossil coral islet, witnessed the evolution of various structures over 250 years, including a powder magazine, an astronomical and meteorological observatory, quays, warehouses, and small enterprises. The sugar industry significantly influenced the harbor's daily activities until the establishment of the Bulk Sugar Terminal in 1980. Today, only a few remaining walls bear testament to the bustling activities that transpired over 150 years.<br>" + "<b>Historically Significant Spots</b><br>" + "Several areas within Le Caudan Waterfront hold historical significance. The first meteorological observatory in the Indian Ocean, now home to the Food Court and the Namasté restaurant, is one such spot. The Blue Penny Museum occupies the former Docks office building.<br>" + "The naming of different wings within the complex reflects episodes from the country's colonial history:<br>" + "Barkly Wharf: Named after Sir Henry Barkly, a Member of Parliament of the British government and appointed governor of Mauritius from 1863-1870.<br>" + "Le Pavillon wing: Derived from Pavillon Street on an ancient map of Port Louis, speculated to have origins during the period when Port Louis was called ‘Port Napoléon.’<br>" + "Dias Pier: A tribute to Diogo Dias, brother of the famous navigator Barthoulomeu Dias, believed to be the first to record the Mascarene Islands on a navigation map.<br>" + "<b>Modern Day Attraction</b><br>";
                        model.title1 = "";
                        model.image1 = R.drawable.port_louis_13;
                        model.text2 = "<br>" + "Caudan, commonly known today, was the island's first major shopping development, and it continues to be an iconic shopping destination for both locals and tourists. The mall features the latest fashion trends, a popular Craft Market, specialty shops offering unique local goods, cinemas, a marina, a bookstore, restaurants, cafes, a museum housing two of the rarest stamps globally, a casino, and tax-free shopping for tourists.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.port_louis_6;
                        model.text4 = "Despite being the first shopping mall on the island, Caudan has adeptly adapted to current trends, maintaining its appeal as a modern waterfront mall. Visitors can witness the bustling port activities as large container and cruise ships navigate in and out.";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.aapravasi_ghat_1;
                        model.text1 = "The Aapravasi Ghat is a historical site located in Port Louis, the capital city of Mauritius. It holds great significance in the history of the island and is recognized as a UNESCO World Heritage Site. The history of the Aapravasi Ghat is closely tied to the indentured labor system that shaped the social and economic landscape of Mauritius.<br>" + "Here is a brief history of the Aapravasi Ghat:<br>" + "1.\t<b>Indentured Labor System:</b> In the 19th century, after the abolition of slavery, the British turned to the system of indentured labor to meet the demand for cheap and abundant workforce for their colonies. Indentured laborers were recruited from various parts of India, as well as China and Africa, to work on plantations in Mauritius and other British colonies.<br>" + "2.\t<b>Establishment of Aapravasi Ghat:</b> The Aapravasi Ghat was established in 1849 as the first site for the reception of indentured laborers in Mauritius. The name \"Aapravasi Ghat\" translates to \"immigration depot\" in Hindi. The location served as a processing center where indentured laborers arriving by ship were registered, housed temporarily, and assigned to various plantations across the island.<br>" + "3.\t<b>Living Conditions:</b> Indentured laborers faced harsh living conditions at the Aapravasi Ghat. They were often crowded into cramped barracks, and the site became a place where many experienced suffering, sickness, and death. The conditions were challenging, and the laborers endured a difficult transition from their home countries to the unfamiliar environment of Mauritius.<br>" + "4.\t<b>End of Indenture:</b> The indenture system continued until the early 20th century when it was officially abolished. The Aapravasi Ghat continued to be used for processing immigrants until 1920. After the cessation of the indenture system, the site underwent various transformations, serving different purposes over the years.<br>" + "5.\t<b>UNESCO World Heritage Site:</b> In 2006, the Aapravasi Ghat was designated as a UNESCO World Heritage Site in recognition of its historical importance in the global migration of indentured laborers and its impact on the multicultural identity of Mauritius.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.aapravasi_ghat_2;
                        model.text2 = "indentured laborers who played a crucial role in shaping the cultural and social fabric of Mauritius. The site is open to visitors, allowing them to explore its history and gain insights into this critical period in the island's past.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 2) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.port_louis_4;
                        model.text1 = "The primary shopping hub in Port Louis is undeniably the Port Louis Central Market, also referred to as the Bazaar of Port Louis. It is segmented into different sections, each hosting diverse stalls offering various products.<br>" + "The central focus of the market revolves around fresh fruits and vegetables, creating a visually stunning display of vibrant produce that is truly a feast for the eyes.<br>" + "Ascending to the first floor, visitors encounter the renowned Craft Market. This section provides an extensive selection of locally crafted souvenirs, spices, and handicrafts at reasonable prices. Whether you're seeking a gift for a challenging recipient, the Craft Market ensures you'll find something suitable. We strongly recommend taking the opportunity to indulge in some shopping.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.port_louis_5;
                        model.text2 = "After a bout of shopping, satisfy your appetite by exploring the adjacent section of the Central Market, home to numerous street food stalls. A wide array of choices awaits, ensuring you find something to suit your taste. Don't miss the chance to try dhall puri, crafted from split chickpea and flour, or the famous alouda, resembling a milkshake with basil seeds, grated jelly, and sometimes a scoop of ice. For those interested in local snacks, there's a diverse range of options, including samoussas (fritters filled with potatoes), bajas (fritters made with chickpea flour), and gato piment (fritters made with yellow split pea and chili).<br>" + "<br>" + "Remaining bustling throughout the week, the Central Market stands as a key shopping destination for locals and draws visitors from across the island. It is undeniably worth a visit, offering insights into local life and allowing you to immerse yourself in the authentic Mauritian atmosphere.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 3) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.marie_reine_de_la_paix_3;
                        model.text1 = "Marie Reine de la Paix, or Mary Queen of Peace, is a Catholic church and holy site, showcasing a remarkable monument portraying the Virgin Mary gracefully holding a globe. Crafted from Carrara marbleby Ferdinando Palla in Italy, this 3-meter-tall statue was unveiledon the Feast of the Assumption in 1940.The Monument was dedicated to Mary Queen of Peace as an expression of gratitude for safeguarding the country during World War I.";
                        model.title1 = "";
                        model.image1 = R.drawable.marie_reine_de_la_paix_5;
                        model.text2 = "This church holds considerable importance as a pilgrimage destination for Catholics in Mauritius. Particularly esteemed during religious festivities like the Feast of the Assumption of the Blessed Virgin Mary, it attracts throngs of devotees to its sacred premises. In 1989, Pope John Paul II graced the church with his presence during his 44th international journey.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.marie_reine_de_la_paix_4;
                        model.text4 = "Nestled on the inclines of Signal Mountain in the capital city of Port Louis, the church transcends its role as a mere place of worship, evolving into a tranquil haven offering a sweeping view of the city. Accessing the church entails ascending seven terraces and 82 steps hewn from rock. Each terrace is adorned with vibrant flowers, and the meticulously manicured surrounding gardens create an idyllic setting for individuals, friends, and families to convene and partake in moments of serene contemplation.";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 4) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.citadelle;
                        model.text1 = "The Fort Adelaide is as a testament to the initial years of British governance in the region. Erected in the 19th century, precisely between 1834 and 1835, by Colonel Thomas Cunningham, the fort's construction presented formidable challenges due to the scarcity of labor caused by the recent abolition of slavery. To address this shortage, the British government initially relied on apprentices, liberated slaves, prisoners, and even some soldiers. However, owing to the lack of skilled labor, the government had to enlist stonemasons, masons, laborers, and other craftsmen from India in 1837 to complete the construction.<br>" + "The primary purpose behind constructing the fort was to safeguard the port against potential invasions and suppress any potential uprising from the local population. It was christened Fort Adelaide in homage to Adelaide, the wife of King William IV of England, featuring her initials and crown on the entrance pediment. Despite never being utilized for military or policing purposes, it stands as one of the few remnants of the period between the abolition of slavery and the arrival of indentured laborers.<br>" + "In contrast to other forts from the British era, such as Fort William and Fort Victoria, which have succumbed to deterioration and neglect, Fort Adelaide remains the sole intact structure. Crafted from black basalt stones, it serves as a testament to the expertise of the craftsmen of that era. Completed in 1840, the fort became a symbol of the commencement of Indian immigration and the cessation of slavery, not only due to those involved in its construction but also due to the circumstances that led to its inception.<br>" + "During the 1830s, tensions ran high in Mauritius, recently brought under British rule. The French inhabitants on the island were discontented about losing control and the prohibition of the slave trade, compounded by the abolition of slavery. The news of the French Revolution of 1830 heightened these tensions. The island's population comprised whites, people of color, and slaves, prompting British authorities to worry about potential enemy attacks or uprisings. Fort Adelaide's construction was sanctioned to provide defensive capabilities in case of invasion or rebellion. The strategic hill of Port-Louis was chosen to oversee the city, port, and mountain slopes.<br>" + "Upon the fort's completion, the island's situation had significantly improved, and its original purpose was no longer applicable. Instead, it was repurposed for signaling fires and announcing the arrival of notable figures through cannon fire or simply for daily ceremonial cannon fire. Over the years, its function evolved into a hub for cultural initiatives, hosting concerts, shows, and various events. Despite this shift, Fort Adelaide remains a pivotal landmark in Mauritius, symbolizing the intricate history of the island.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 5) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.le_morne_beach_2;
                        model.text1 = "Nestled on a peninsula along the western coast of Mauritius, at the base of the UNESCO-listed Morne Brabant mountain, lies Le Morne Beach. Easily accessible from the coastal road, this public beach boasts miles of pristine white sand and is adorned with majestic casuarina trees, all against the backdrop of the crystal-clear waters providing excellent visibility for scuba diving.";
                        model.title1 = "";
                        model.image1 = R.drawable.kite_surfing;
                        model.text2 = "Renowned as one of the premier kite-surfing spots in Mauritius, and often regarded as one of the best in the world, Le Morne Beach offers a breathtaking setting with its iconic mountain in the background. The beach is a favorite among windsurfers and kite surfers, as the conditions for these water sports are ideal throughout much of the year. The annual Kiteival, attracting international participants, is among the many competitions hosted at this spectacular location.<br>" + "While Le Morne Beach remains a delightful spot for swimming, it can get quite busy on weekends and holidays. Nudism is prohibited, although topless sunbathing is accepted. For a more tranquil experience, the best times to visit the beach are early in the morning from 8:00 to 11:00 or in the afternoon from 13:00 to 17:00.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.paddle_boarding;
                        model.text4 = "An array of activities awaits beachgoers, including pedalo rides, windsurfing, kite surfing, scuba diving, stand-up paddleboarding, and kayaking, ensuring there's something for everyone to enjoy at Le Morne Beach.";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 6) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.le_morne_1;
                        model.text1 = "Added to the World Heritage List in 2008, the Le Morne Cultural Landscape is a mountain on the southwestern edge of Mauritius, extending into the Indian Ocean. This site served as a refuge for runaway slaves, commonly referred to as maroons, spanning the 18th century until the early 1900s.<br>" + "The mountain bears an almost fortress-like character, featuring vertical cliffs encircling it, steep slopes crisscrossed by ravines and valleys, and, at its summit, a relatively level plateau—all of which offered refuge to the maroon slaves.<br>" + "A wide gorge, referred to as the V-Gap or the mountain's crucial entry point, posed challenges for accessing the plateau. Both oral traditions and early written records suggest the presence of a narrow and hazardous passage that the maroons had to navigate to evade pursuers and find sanctuary at the summit.<br>" + "Archaeological excavations conducted in cave shelters on the mountain unveiled ashy deposits, providing evidence of fire utilization. Additionally, the discovery of the 300-year-old remains of a young sheep supports the notion that maroons occupied the mountain's summit, successfully securing their survival.<br>" + "The distinctive and fragile ecosystem of Le Morne Brabant Mountain harbors numerous endemic plant species, some of which are among the rarest in the world.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.brabant_6;
                        model.text2 = "The flora is exceptionally varied, encompassing 73 out of the 311 species of flowering plants that are exclusive to Mauritius. Among these, the L’Immortelle Du Morne, or Helichrysum Mauritianum, stands out as an endemic species found specifically on the mountain.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.brabant_8;
                        model.text4 = "The International Slave Route Monument is a tangible representation of the historical impact of slavery in Mauritius and globally. The central monument is encircled by nine smaller stone sculptures, symbolizing the origins and destinations of enslaved individuals.";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.brabant_4;
                        model.text9 = "A notable sculpture, crafted by Haitian artist Fritz Laratte, embodies the theme of liberation from slavery. It narrates the tale of a slave who, through prayer, witnessed the sudden release of his hands from the chains of servitude.<br>" + "The unique Ah-yee shop, an integral part of Trou-Chenille village since its inception, served as a crucial source of basic necessities for the villagers. Testimonies reveal that the villagers relocated along with the shop.<br>" + "Stella Maris, the initial Catholic chapel in Le Morne dating back to 1891, originally situated in Trou-Chenille, found its relocation to L’Embrasure during WWI. Following destruction by a cyclone in 1975, it was reconstructed in concrete in Le Morne Village in 1987.<br>";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.brabant_7;
                        model.text11 = "Trou-Chenille, an integral component of the cultural heritage within the Le Morne Cultural Landscape, retains an open-air museum featuring five traditional huts portraying various aspects of daily life.<br>" + "Archaeological investigations uncovered evidence of a 19th-20th century settlement, Macaque, at the foot of Le Morne Brabant, likely associated with the Labonté and Béguinot families from Madagascar.<br>";
                        model.image5 = R.drawable.brabant_9;
                        model.text12 = "An abandoned cemetery, identified in a remote area beneath the mountain, dates back to the 19th century, with archaeological findings suggesting a connection to individuals of Malagasy and Mozambican origin.";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 7) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.maconde_1;
                        model.text1 = "The Maconde viewpoint is locatedon the southern coast of Baie du Cap, a charming and modest village celebrated for its striking natural allure and untamed, rugged coastlines. The viewpoint is nestled on a curved stretch of the coastal road atop a small rocky cliff. The landscape unfolds with picturesque vistas, featuring the vibrant red earth, lush green forests, rows of palm trees, and the glistening expanse of the Indian Ocean, creating a truly mesmerizing experience.<br>" + "Legend has it that the name \"Maconde\" traces its roots to the era of slavery, where runaway slaves from the Makonde tribe in Mozambique sought refuge in this area, while others believe it was named after Governor Jean Baptiste Henri Conde, who constructed an outlook on the cliff.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.maconde_2;
                        model.text2 = "Access to this region was historically challenging, and it wasn't until the 1920s that the first road was constructed, overcoming the difficulties posed by the low-lying coast and uneven terrain. Recent renovations have significantly enhanced safety. The winding road along basalt cliffs, with the rhythmic sounds of the ocean against the rocks, provides a captivating spectacle, making it a favored spot for those captivated by ocean swells.<br>" + "To reach the viewpoint, ascend a set of narrow stairs, where you'll be greeted by panoramic views of the ocean, the nearby coastal village, and occasional fishermen along the shore.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 8) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.chamarel_2;
                        model.text1 = "The Seven Coloured Earths form a geological wonder and a popular tourist destination situated in the Chamarel plain of the Rivière Noire District in southwestern Mauritius. This unique site encompasses small sand dunes exhibiting seven distinctive colors—red, brown, violet, green, blue, purple, and yellow. The remarkable characteristic of this location lies in the settling of differently colored sands in distinct layers, creating surrealistic and striped patterns on the dunes. Over time, rains have sculpted captivating designs into the hillside, resulting in an effect reminiscent of earthen meringue.<br>" + "These sands originate from the decomposition of volcanic rock (basalt) gullies into clay, later transformed into ferralitic soil through total hydrolysis. The primary elements responsible for the red/anthracite and blue/purplish colors are iron and aluminum, respectively. The various hues are thought to be a consequence of the molten volcanic rock cooling down at different external temperatures, although the specific causes of their consistent and spontaneous separation are not fully understood.<br>" + "The term \"Seven Coloured Earths\" serves as a descriptive, rather than an official, name. Various versions, including \"Chamarel Seven Coloured Earths,\" \"Chamarel Coloured Earth(s),\" \"Coloured Earth,\" and Terres des Sept Couleurs in French, have been reported.<br>" + "This phenomenon can be replicated on a smaller scale by taking sands of different colors, mixing them together, and observing their eventual separation into a layered spectrum.<br>" + "Since the 1960s, this site has evolved into one of Mauritius' major tourist attractions. Presently, the dunes are safeguarded by a wooden fence, and visitors are prohibited from climbing on them. However, observation outposts along the fence allow visitors to enjoy the scenery. Curio shops in the vicinity offer small test tubes containing the colored sands.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 9) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.chamarel_1;
                        model.text1 = "Unquestionably the tallest single-drop waterfall in Mauritius, standing at an impressive height of approximately 100m, the Chamarel Waterfall is a captivating natural wonder nestled amidst lush vegetation. Fueled by the convergence of three distinct streams flowing into the Saint Denis River, the waterfall exhibits a formidable rush, boasting a peak flow rate exceeding 40,000 m³ per minute.<br>" + "As you traverse the 3km access road of the Seven Coloured Earth Geopark, providing a picturesque drive to the geosite, be sure not to overlook the waterfall's viewpoint on your left. Accessible through a trail winding through dense foliage, the viewpoint offers a front-row spectacle of this natural marvel.<br>" + "Perched on the edge of a basalt cliff, the Chamarel Waterfall cascades into an oval pool before meandering through a 6km canyon fringed by tropical forests, eventually reaching Baie du Cap. The sight not only immerses the senses in freshness but also serves as a stunning testament to millions of years of volcanic activity. The dramatic landscape is shaped by lavas from two distinct ages. The brecciated basalt layer near the base dates back to 10 to 8 million years ago, overlaying a second layer from the intermediate period between 3.5 and 1.7 million years ago.<br>" + "Embark on a three-hour trek through the secret valley of the Chamarel Waterfall, leading you to the waterfall's base, where you can enjoy a refreshing swim in the pool as the majestic waterfall showers you from above.<br>" + "This location, characterized by its exceptional beauty, will mesmerize you with sights and sounds reminiscent of a true tropical rainforest. <br>";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 10) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.black_river_georges_2;
                        model.text1 = "Black River Gorges National Park, located in the hilly southwestern region of Mauritius, was officially established on June 15, 1994, and is under the management of the National Parks and Conservation Service. Encompassing a total area of 67.54 km², the park features diverse habitats, including humid upland forests, drier lowland forests, and marshy heathlands. Visitor facilities within the park comprise two information centers, picnic areas, and an extensive network of 60 kilometers of trails. Additionally, there are four field stations dedicated to research and conservation projects conducted by the National Parks and Conservation Service and the Mauritian Wildlife Foundation.<br>" + "The primary aim of the park is to safeguard a significant portion of the island's remaining rainforest, even though parts of it have suffered degradation due to the introduction of non-native plants like Chinese guava and privet, as well as the presence of invasive animals such as the rusa deer and wild pigs. To preserve native wildlife, specific areas within the park have been cordoned off, and efforts have been made to eliminate invasive species. <br>";
                        model.title1 = "";
                        model.image1 = R.drawable.fody;
                        model.text2 = "Despite the challenges, the park continues to host a variety of endemic plants and animals, including the Mauritian flying fox and all endemic bird species on the island: Mauritius kestrel, pink pigeon, Mauritius parakeet, Mauritius cuckooshrike, Mauritius bulbul, Mauritius olive white-eye, Mauritius grey white-eye, and Mauritius fody. Recognized as an Important Bird Area by BirdLife International, Black River Gorges National Park plays a crucial role in the conservation of Mauritius' unique biodiversity.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 11) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.grand_bassin_1;
                        model.text1 = "Grand Bassin, also known as Ganga Talao, is located in the Savanne quiet mountain area. It's a crater lake about 550 meters above sea level. The first group of people to visit Ganga Talao was from the village of Triolet, led by Pandit Giri Gossayne in 1898. This place is sacred to Hindus in Mauritius.<br>" + "The Shiv Mandir is on the lake's bank and is dedicated to Shiva. During Shivaratri, around half a million Hindus in Mauritius go on a pilgrimage to the lake, with many walking barefoot from their homes carrying Kanvars.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.grand_bassin_2;
                        model.text2 = "The name Ganga Talao means \"Lake of Ganga,\" connecting it symbolically to the Indian river Ganga (Ganges).<br>" + "<b>History</b><br>" + "In 1866, Pandit Sanjibonlal returned to Mauritius from India after his first contract and turned Grand Bassin into a pilgrimage place. He converted a building into a temple and brought a Shivalingam from India. <br>" + "In 1897, Jhummon Giri Gosagne Napal, a priest, had a dream about the water of Grand Bassin being part of Ganga. The lake was then known as \"Pari Talao,\" and in 1998, it was declared a \"sacred lake.\" In 1972, Ganga water from the Ganges River was mixed with the lake water, and it was renamed Ganga Talao.<br>" + "<b>Events</b><br>" + "During Maha Shivaratri, devotees start a journey on foot to Grand Bassin, and volunteers offer food and drinks to the pilgrims. The lake hosts a 33-meter-tall statue of Shiva called Mangal Mahadev, inaugurated in 2007. Durga Pooja and Navaratri are celebrated grandly near the statue, and Shiva Ratri is a national holiday celebrated auspiciously by Hindus in Mauritius.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 12) {

                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.gris_gris_coastal_4;
                        model.text1 = "This enchanting havendistinguishes itself by the absence of a coral barrier reef, making it truly unique. The ocean waves vigorously crash against the shoreline, providing captivating vistas for visitors. Gris Gris beach stands in stark contrast to other tranquil and calm beaches in Mauritius, known for their coral reef protection. The island's typical coral reef barrier contributes to calmer ocean waves and shallow beach waters, creating ideal swimming conditions. However, Gris Gris, surprisingly, lacks this barrier reef.";
                        model.title1 = "";
                        model.image1 = R.drawable.gris_gris_3;
                        model.text2 = "A visit to Gris Gris is an absolute essential for anyone exploring Mauritius. The beach's beauty is awe-inspiring, with towering cliffs descending toward the ocean, where turbulent waves crash against rocks, creating a striking white froth accompanied by a resounding crash. Located at the southernmost point of of Mauritius, a few kilometers southeast of the village of Souillac, Gris Gris boasts a unique history dating back to the French colonial era.<br>" + "The name \"Gris Gris\" adds an intriguing dimension to the experience. Upon entering the beach, a large sign displays the history behind the name. According to local tradition, \"Gris Gris\" is linked to the African amulet known as the “Gris Gris” and its association with the tumultuous coastline. However, the story takes an unexpected turn, suggesting that Gris Gris might have been the name of a puppy belonging to a French cartographer who visited the coast in 1753.<br>";
                        model.title2 = "Gris Gris Beach";
                        model.text3 = "";
                        model.image2 = R.drawable.gris_gris_1;
                        model.text4 = "The primary beach area features an expansive green field with a commanding view of dramatic cliffs and enormous waves. There are benches and a pavilion available for relaxation while taking in the scenery.<br>" + "To the left, a concrete staircase descends to the beach, but swimming is strongly discouraged due to the high danger level. The powerful waves can swiftly overwhelm swimmers. Instead, enjoy a leisurely stroll along the beach, heading toward a small cave at the far end.<br>";
                        model.title3 = "Caves at Gris Gris";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.grisgris_2;
                        model.text9 = "In addition to the cave on the far left side of the beach, two other hidden caves can be discovered at Gris Gris. These are more challenging to reach, involving a descent down a cliff and walking through the water.<br>" + "Caution is advised against going all the way down, as water levels can fluctuate unpredictably, and the current is often too strong.<br>" + "For those eager to explore the secret caves at Gris Gris, head towards the cliff's edge directly across from the parking lot. Upon reaching the spot, descend only about halfway to catch a glimpse of the caves on your right.<br>" + "It's important to bear in mind that entering the caves could pose risks if the water level rises!<br>" + "Gris Gris beach is intricately connected to the village of Souillac, which relies heavily on tourism for its revenue. Established 200 years ago as a port for ships sailing from Europe to India, Souillac has a rich history worth exploring. Plan your day strategically to make the most of your visit to the southern part of Mauritius, and consider including a visit to Rochester Falls, just outside the village, renowned for its distinctive rectangular-sided rocks.<br>";
                        model.title8 = "La Roche qui Pleure";
                        model.text10 = "";
                        model.image4 = R.drawable.la_roche_qui_pleure;
                        model.text11 = "This mystical site derives its name from the visual impression it creates: as water trickles down its walls, the cliffs appear to shed tears. Even more astonishing, some claim to recognize the eroded features of the Mauritian poet Robert Edward Hart.<br>" + "From a geographical and climatic standpoint, unlike other parts of the island, La Roche qui Pleure lacks coral reefs. Consequently, its shores are more exposed to the assaults of the ocean. This absence of a natural barrier results in more powerful and spectacular waves, a stark contrast to the tranquil lagoons typically associated with the island. The region is influenced by strong winds and seasonal variations, shaping its unique landscape and marine dynamics.<br>";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }
                }
                else if (Stash.getString("iterneraries_type").equals("Day11")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.pamplemousse_garden;
                        model.text1 = "The Sir Seewoosagur Ramgoolam Botanic Garden, also known as the Pamplemousses Botanic Garden, is a prominent tourist attraction located in Pamplemousses near Port Louis, Mauritius. It holds the distinction of being the oldest botanical garden in the Southern Hemisphere. Established in 1770 by Pierre Poivre, the garden spans approximately 37 hectares (91 acres) and is renowned for its expansive pond featuring giant water lilies (Victoria amazonica).<br>" + "Throughout its history, the garden underwent various name changes, reflecting its evolving status and ownership. Notable names include 'Jardin de Mon Plaisir,' 'Jardin des Plantes,' 'Le Jardin National de l’Ile de France,' 'Jardin Royal,' 'Jardin Botanique des Pamplemousses,' 'The Royal Botanical Gardens of Pamplemousses,' and 'The Royal Botanic Gardens, Pamplemousses.' Eventually, on September 17, 1988, it was officially named the \"Sir Seewoosagur Ramgoolam Botanic Garden\" in honor of the first prime minister of Mauritius.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.botanical_garden_1;
                        model.text2 = "Beyond the mesmerizing giant water lilies, the garden boasts an assortment of spices, ebonies, sugar canes, and 85 palm varieties sourced from Central America, Asia, Africa, and the Indian Ocean islands. Noteworthy individuals, including Princess Margaret, Countess of Snowdon, Indira Gandhi, François Mitterrand, and Robert Mugabe, have contributed by planting trees within the garden.<br>" + "Situated in the village of Pamplemousses, approximately seven miles northeast of Port Louis, the garden has a rich history dating back to 1729 when it was set aside for colonist P. Barmont. Over the years, it changed hands multiple times, with various owners contributing to its expansion and development. Today, it covers an area of about 25,110 hectares (62,040 acres), with the remaining portion serving as an experimental station.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.botanical_garden_3;
                        model.text4 = "<br>" + "The roots of the Royal Botanic Gardens can be traced to the initiative of Mahé de La Bourdonnais, the first French Governor of Mauritius, in 1735. Initially created as a vegetable garden for his household and the burgeoning township of Port Louis, the garden evolved into a botanical haven. Under Pierre Poivre's directorship in 1768, the garden became a hub for acclimatizing plants from overseas and nurturing crops with economic significance, such as cassava.<br>";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.botanical_garden_2;
                        model.text9 = "Throughout its history, the garden weathered periods of neglect and upheaval, with directors like James Duncan contributing to its restoration and enhancement. In 1866, during a malaria epidemic, the garden played a crucial role in producing Eucalyptus trees to combat the disease.<br>" + "The Department of Agriculture assumed responsibility for the garden in 1913, overseeing its development and maintenance. Notably, following Seewoosagur Ramgoolam's death in 1985, part of the botanical garden was dedicated to a crematorium, marking the first instance of someone being cremated within its grounds.<br>" + "<br>" + "The Sir Seewoosagur Ramgoolam Botanic Garden stands as a testament to Mauritius's botanical heritage, offering visitors a captivating journey through its lush landscapes and rich history.<br>";
                        model.title8 = "Chateau de Mon Plaisir";
                        model.text10 = "";
                        model.image4 = R.drawable.botanical_garden_4;
                        model.text11 = "Until 1839, the Chateau de Mon Plaisir featured a modest structure characterized by a flat roof and circular verandahs. The current single-story building, constructed by the English in the mid-19th century, has been designated as a National Monument, giving it legal protection. Visitors can enjoy a charming panorama of the Moka Range and the Peak of Pieter Both from the Chateau.";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.sugar_museum_pamplemousses;
                        model.text1 = "Located not too far from the Pamplemousse Botanical Garden, amidst a picturesque setting featuring a bougainvillea and coconut tree-lined alley, a pond surrounded by lush greenery, stands the impressively renovated sugar mill—a truly spectacular attraction on the island!<br>" + "From the moment the Dutch set foot in Mauritius and introduced sugar canes to the island, the sugar industry has played a significant role in the island's history. At L'Aventure du Sucre, you'll delve into the intricacies of the sugar-making process and explore the colonial past that has profoundly shaped Mauritius into what it is today. Traverse a 250-year historical journey within the museum, a former operational sugar factory, and conclude your tour with a delightful sugar tasting experience, along with sampling various products derived from the golden era of colonial centuries.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.laventure_du_sucre;
                        model.text2 = "Embark on your museum tour by delving into the history of sugar plantations in Mauritius. Gain insights into the Dutch era, succeeded by the French and eventually the English colonists. Following this historical exploration, proceed to the operational factory, which remained active until the 1970s. Immerse yourself in the intricate stages of the sugar-making process showcased in vivid detail. Complement your visit to L'Aventure du Sucre by exploring the Village Boutik for gift shopping and souvenirs. Alternatively, enjoy a delightful pause at Restaurant Le Fangourin, savoring the nuances of Mauritian cuisine.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 2) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.port_louis_3;
                        model.text1 = "Le Caudan Waterfront is as a prominent commercial development in Port Louis, the capital city of Mauritius, offering a diverse array of amenities such as shops, banking facilities, casinos, cinemas, restaurants, a marina, and the renowned five-star hotel, Le Labourdonnais.<br>" + "<b>Historical Roots:</b><br>" + "The name \"Le Caudan Waterfront\" pays homage to Jean Dominique Michel de Caudan, a notable figure who arrived in the former Isle de France from Languedoc, a historical province in the South of France, in 1726. He initiated a saltpan near a small bay in the southwest of Port-Louis, now recognized as the Robert Edward Hart Garden, situated on the entrance road to Le Caudan Waterfront.<br>" + "The peninsula of Le Caudan, formed around a fossil coral islet, witnessed the evolution of various structures over 250 years, including a powder magazine, an astronomical and meteorological observatory, quays, warehouses, and small enterprises. The sugar industry significantly influenced the harbor's daily activities until the establishment of the Bulk Sugar Terminal in 1980. Today, only a few remaining walls bear testament to the bustling activities that transpired over 150 years.<br>" + "<b>Historically Significant Spots</b><br>" + "Several areas within Le Caudan Waterfront hold historical significance. The first meteorological observatory in the Indian Ocean, now home to the Food Court and the Namasté restaurant, is one such spot. The Blue Penny Museum occupies the former Docks office building.<br>" + "The naming of different wings within the complex reflects episodes from the country's colonial history:<br>" + "Barkly Wharf: Named after Sir Henry Barkly, a Member of Parliament of the British government and appointed governor of Mauritius from 1863-1870.<br>" + "Le Pavillon wing: Derived from Pavillon Street on an ancient map of Port Louis, speculated to have origins during the period when Port Louis was called ‘Port Napoléon.’<br>" + "Dias Pier: A tribute to Diogo Dias, brother of the famous navigator Barthoulomeu Dias, believed to be the first to record the Mascarene Islands on a navigation map.<br>" + "<b>Modern Day Attraction</b><br>";
                        model.title1 = "";
                        model.image1 = R.drawable.port_louis_13;
                        model.text2 = "<br>" + "Caudan, commonly known today, was the island's first major shopping development, and it continues to be an iconic shopping destination for both locals and tourists. The mall features the latest fashion trends, a popular Craft Market, specialty shops offering unique local goods, cinemas, a marina, a bookstore, restaurants, cafes, a museum housing two of the rarest stamps globally, a casino, and tax-free shopping for tourists.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.port_louis_6;
                        model.text4 = "Despite being the first shopping mall on the island, Caudan has adeptly adapted to current trends, maintaining its appeal as a modern waterfront mall. Visitors can witness the bustling port activities as large container and cruise ships navigate in and out.";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 3) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.aapravasi_ghat_1;
                        model.text1 = "The Aapravasi Ghat is a historical site located in Port Louis, the capital city of Mauritius. It holds great significance in the history of the island and is recognized as a UNESCO World Heritage Site. The history of the Aapravasi Ghat is closely tied to the indentured labor system that shaped the social and economic landscape of Mauritius.<br>" + "Here is a brief history of the Aapravasi Ghat:<br>" + "1.\t<b>Indentured Labor System:</b> In the 19th century, after the abolition of slavery, the British turned to the system of indentured labor to meet the demand for cheap and abundant workforce for their colonies. Indentured laborers were recruited from various parts of India, as well as China and Africa, to work on plantations in Mauritius and other British colonies.<br>" + "2.\t<b>Establishment of Aapravasi Ghat:</b> The Aapravasi Ghat was established in 1849 as the first site for the reception of indentured laborers in Mauritius. The name \"Aapravasi Ghat\" translates to \"immigration depot\" in Hindi. The location served as a processing center where indentured laborers arriving by ship were registered, housed temporarily, and assigned to various plantations across the island.<br>" + "3.\t<b>Living Conditions:</b> Indentured laborers faced harsh living conditions at the Aapravasi Ghat. They were often crowded into cramped barracks, and the site became a place where many experienced suffering, sickness, and death. The conditions were challenging, and the laborers endured a difficult transition from their home countries to the unfamiliar environment of Mauritius.<br>" + "4.\t<b>End of Indenture:</b> The indenture system continued until the early 20th century when it was officially abolished. The Aapravasi Ghat continued to be used for processing immigrants until 1920. After the cessation of the indenture system, the site underwent various transformations, serving different purposes over the years.<br>" + "5.\t<b>UNESCO World Heritage Site:</b> In 2006, the Aapravasi Ghat was designated as a UNESCO World Heritage Site in recognition of its historical importance in the global migration of indentured laborers and its impact on the multicultural identity of Mauritius.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.aapravasi_ghat_2;
                        model.text2 = "indentured laborers who played a crucial role in shaping the cultural and social fabric of Mauritius. The site is open to visitors, allowing them to explore its history and gain insights into this critical period in the island's past.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 4) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.blue_penny_museum_2;
                        model.text1 = "The Blue Penny Museum in Mauritius was inaugurated in November 2001 and is dedicated to showcasing the history and art of the island. Its name is derived from the famous 1847 Blue Penny and Red Penny stamps, which hold great historical significance.<br>" + "Here's a brief history of the Blue Penny Museum:<br>" + "1.\t<b>Stamp Acquisition (1993):</b> The museum's centerpiece is the 1847 Blue Penny and Red Penny stamps, considered some of the rarest and most valuable stamps in the world. In 1993, a consortium of Mauritian enterprises, led by The Mauritius Commercial Bank, purchased the stamps for $2,000,000. These stamps were then repatriated to Mauritius, marking their return to the island after nearly 150 years.<br>" + "2.\t<b>Museum Inauguration (2001):</b> The Blue Penny Museum officially opened its doors to the public in November 2001. It was established as a cultural institution aimed at preserving and showcasing Mauritius's rich history and artistic heritage.<br>" + "3.\t<b>Conservation Efforts:</b> Given the extreme rarity and value of the Blue Penny stamps, conservation efforts were implemented. The originals are illuminated only temporarily to prevent damage from prolonged exposure. Visitors to the museum typically view replicas of the stamps, ensuring the long-term preservation of the priceless artifacts.<br>" + "4.\t<b>Founder - The Mauritius Commercial Bank:</b> The museum was founded by The Mauritius Commercial Bank, one of the leading financial institutions in Mauritius. This initiative reflects the bank's commitment to preserving and promoting the cultural heritage of the island.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.blue_penny_museum_1;
                        model.text2 = "5.\t<b>Additional Artifacts: In addition to the Blue Penny stamps, the museum houses other notable artifacts, including the original statue of Paul and Virginia. Crafted by Prosper d'Épinay in 1881, this statue adds to the cultural and artistic richness of the museum's collection.<br>" + "The Blue Penny Museum has become a significant cultural institution in Mauritius, attracting both locals and tourists interested in exploring the island's history through its valuable artifacts and exhibits.<br>" + "The Blue Penny Museum is structured across two floors, each offering distinct features and exhibits:<br>" + "<b>Ground Floor:</b><br>" + "1.\t<b>Souvenir Shop: Visitors are welcomed by a souvenir shop on the ground floor, providing an opportunity to purchase mementos related to the museum and Mauritius.<br>" + "2.\t<b>Temporary Exhibition Room: The ground floor houses a temporary exhibition room, showcasing rotating exhibits that may vary over time, allowing for diverse and dynamic displays.<br>" + "First Floor:<br>" + "1.\t<b>The Age of Discovery:</b> This exhibition room narrates the stories of pioneers who undertook the first oceanic voyages to reach the Mascarene Islands. It prominently features ancient maps that document this historic journey.<br>" + "2.\t<b>The Island Builders:</b> Covering three significant periods in Mauritius's history—the Dutch Period, the French Period, and the English Taking Over—this room provides a comprehensive overview of the island's historical evolution.<br>" + "3.\t<b>Port Louis:</b> This exhibition room focuses on the origins and history of Port Louis, offering insights into the development and growth of the city.<br>" + "4.\t<b>The Postal Adventure:</b> Dedicated to the postal history of Mauritius, this room proudly displays two stamps from the renowned Blue Penny collection, contributing to the island's philatelic heritage.<br>" + "5.\t<b>Engraved Memory:</b> Honoring Joseph Osmond Barnard, the first individual to engrave stamps in Mauritius, this room serves as a tribute to his significant contributions to the field.<br>" + "Overall, the Blue Penny Museum is thoughtfully organized to provide visitors with a captivating journey through Mauritius's history, art, and unique cultural heritage.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 5) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.black_river_georges_2;
                        model.text1 = "Black River Gorges National Park, located in the hilly southwestern region of Mauritius, was officially established on June 15, 1994, and is under the management of the National Parks and Conservation Service. Encompassing a total area of 67.54 km², the park features diverse habitats, including humid upland forests, drier lowland forests, and marshy heathlands. Visitor facilities within the park comprise two information centers, picnic areas, and an extensive network of 60 kilometers of trails. Additionally, there are four field stations dedicated to research and conservation projects conducted by the National Parks and Conservation Service and the Mauritian Wildlife Foundation.<br>" +
                                "The primary aim of the park is to safeguard a significant portion of the island's remaining rainforest, even though parts of it have suffered degradation due to the introduction of non-native plants like Chinese guava and privet, as well as the presence of invasive animals such as the rusa deer and wild pigs. To preserve native wildlife, specific areas within the park have been cordoned off, and efforts have been made to eliminate invasive species. <br>";
                        model.title1 = "";
                        model.image1 = R.drawable.fody;
                        model.text2 = "Despite the challenges, the park continues to host a variety of endemic plants and animals, including the Mauritian flying fox and all endemic bird species on the island: Mauritius kestrel, pink pigeon, Mauritius parakeet, Mauritius cuckooshrike, Mauritius bulbul, Mauritius olive white-eye, Mauritius grey white-eye, and Mauritius fody. Recognized as an Important Bird Area by BirdLife International, Black River Gorges National Park plays a crucial role in the conservation of Mauritius' unique biodiversity.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 6) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.chamarel_2;
                        model.text1 = "The Seven Coloured Earths form a geological wonder and a popular tourist destination situated in the Chamarel plain of the Rivière Noire District in southwestern Mauritius. This unique site encompasses small sand dunes exhibiting seven distinctive colors—red, brown, violet, green, blue, purple, and yellow. The remarkable characteristic of this location lies in the settling of differently colored sands in distinct layers, creating surrealistic and striped patterns on the dunes. Over time, rains have sculpted captivating designs into the hillside, resulting in an effect reminiscent of earthen meringue.<br>" +
                                "These sands originate from the decomposition of volcanic rock (basalt) gullies into clay, later transformed into ferralitic soil through total hydrolysis. The primary elements responsible for the red/anthracite and blue/purplish colors are iron and aluminum, respectively. The various hues are thought to be a consequence of the molten volcanic rock cooling down at different external temperatures, although the specific causes of their consistent and spontaneous separation are not fully understood.<br>" +
                                "The term \"Seven Coloured Earths\" serves as a descriptive, rather than an official, name. Various versions, including \"Chamarel Seven Coloured Earths,\" \"Chamarel Coloured Earth(s),\" \"Coloured Earth,\" and Terres des Sept Couleurs in French, have been reported.<br>" +
                                "This phenomenon can be replicated on a smaller scale by taking sands of different colors, mixing them together, and observing their eventual separation into a layered spectrum.<br>" +
                                "Since the 1960s, this site has evolved into one of Mauritius' major tourist attractions. Presently, the dunes are safeguarded by a wooden fence, and visitors are prohibited from climbing on them. However, observation outposts along the fence allow visitors to enjoy the scenery. Curio shops in the vicinity offer small test tubes containing the colored sands.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }

                }
                else if (Stash.getString("iterneraries_type").equals("Day12")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.trou_aux_cerfs_4;
                        model.text1 = "The Trou aux Cerfs crater is surrounded by a vast expanse of lush forest home toindigenous plant species and some enormous green pine trees. It is thought to have erupted once and been inactive for the past 700 000 years, although scientists believe there may be a chance for it to erupt again.<br>" + "Undoubtedly, one of its main attractions is the panoramic 360-degree view encompassing the town of Curepipe, along with stunning views of Rempart Mountain, Trois Mamelles, and the PortLouis-Moka mountain range.<br>" + "This lush and green verdant sanctuary serves as a favored jogging locale for the locals. Evolving into a social gathering place, it regularly attracts joggers every at around five o’clock in the morning. A gazebo provides a pleasant spot to sit, relax, and appreciate the unparalleled natural beauty. Due to the surrounding woods and elevation, it can become slightly chilly, so it is advisable to bring along a light sweater or shawl.<br>" + "There are three primary access points to Trou aux Cerfs, specifically the La Hausse de la Louviere Road, the Edgar Huges Road, and the Crater Lane. Parking facilities are available.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.grand_bassin_1;
                        model.text1 = "Grand Bassin, also known as Ganga Talao, is located in the Savanne quiet mountain area. It's a crater lake about 550 meters above sea level. The first group of people to visit Ganga Talao was from the village of Triolet, led by Pandit Giri Gossayne in 1898. This place is sacred to Hindus in Mauritius.<br>" +
                                "The Shiv Mandir is on the lake's bank and is dedicated to Shiva. During Shivaratri, around half a million Hindus in Mauritius go on a pilgrimage to the lake, with many walking barefoot from their homes carrying Kanvars.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.grand_bassin_2;
                        model.text2 = "The name Ganga Talao means \"Lake of Ganga,\" connecting it symbolically to the Indian river Ganga (Ganges).<br>" +
                                "<b>History</b><br>" +
                                "In 1866, Pandit Sanjibonlal returned to Mauritius from India after his first contract and turned Grand Bassin into a pilgrimage place. He converted a building into a temple and brought a Shivalingam from India. <br>" +
                                "In 1897, Jhummon Giri Gosagne Napal, a priest, had a dream about the water of Grand Bassin being part of Ganga. The lake was then known as \"Pari Talao,\" and in 1998, it was declared a \"sacred lake.\" In 1972, Ganga water from the Ganges River was mixed with the lake water, and it was renamed Ganga Talao.<br>" +
                                "<b>Events</b><br>" +
                                "During Maha Shivaratri, devotees start a journey on foot to Grand Bassin, and volunteers offer food and drinks to the pilgrims. The lake hosts a 33-meter-tall statue of Shiva called Mangal Mahadev, inaugurated in 2007. Durga Pooja and Navaratri are celebrated grandly near the statue, and Shiva Ratri is a national holiday celebrated auspiciously by Hindus in Mauritius.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 2) {

                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.bois_cheri_1;
                        model.text1 = "The Bois Cheri Plantation was established in 1892 and since then has become the largest tea producer in the country. Covering more than 250 hectares, it includes a museum and a factory where visitors can learn all about the art and science of tea.<br>" + "When you visit the tea estate, you can join guided tours to explore the factory, see the museum and plantation, and even try some tea tasting. Your guide will share the history and stories of Bois Chéri and explain how important tea production is for Mauritius.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.bois_cheri_8;
                        model.text2 = "If you enjoy tea and nature, this tour is a must. The plantation is close to the museum and the main factory, surrounded by lush greenery. The peaceful setting provides a perfect backdrop for relaxation.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.bois_cheri_6;
                        model.text4 = "Aside from the beautiful tea plantation, you'll enjoy picturesque views of the South coast on one side and a stunning crater lake on the other. Driving around is delightful, with spots to stop and capture photos of the lake, unique trees, and tea plantations from different angles.";
                        model.title3 = "The factory and Museum";
                        model.text5 = "The museum provides lots of information about Mauritian tea history, showcasing old machines used in tea production, including an old locomotive train. The factory tour allows you to see the tea-making process in action. Bois Cheri produces both green and black tea, with their signature being vanilla tea.";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.bois_cheri_7;
                        model.text9 = "After your museum and factory adventure, it's time for tea tasting. Head to the factory café near the restaurant to try various teas. You can also purchase waffles or pancakes to enjoy with your tea.<br>" + "The Bois Cheri restaurant is within walking distance and offers breathtaking views of the south coast. The restaurant serves unique cuisines, including local flavors. You'll have the chance to taste dishes like shrimps with green tea and chicken with exotic tea. Whether you visit with friends or family, the restaurant and the entire tour offer a delightful experience with delicious food, scenic views, and soothing music.<br>";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.bois_cheri_4;
                        model.text11 = "<b>Visit Hours</b><br>" + " <br>" + "Monday to Friday:<br><br>" + "09.00 - 14.00<br><br>" + "Saturday:<br><br>" + "09.00 - 11.00<br><br>" + "<b>Bois Chéri Tea FactoryOperating Hours</b><br><br>" + "Monday - Friday 09.00 - 14.00 & Saturday 09.00 - 11.00 (closed on Sundays & public holidays)<br> ";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }
//                    TODO change
                    else if (position == 3) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.la_vanilla_1;
                        model.text1 = "Discover the native plants and animals of Mauritius and its neighboring islands at La Vanille Nature Park. You may see Nile Crocodiles, tenrecs, eels, iguanas, and turtles from Madagascar and the Seychelles among the reserve's wildlife under the shade of large bamboo and palm trees.";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 4) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.gris_gris_1;
                        model.text1 = "The primary beach area features an expansive green field with a commanding view of dramatic cliffs and enormous waves. There are benches and a pavilion available for relaxation while taking in the scenery.\n" +
                                "To the left, a concrete staircase descends to the beach, but swimming is strongly discouraged due to the high danger level. The powerful waves can swiftly overwhelm swimmers. Instead, enjoy a leisurely stroll along the beach, heading toward a small cave at the far end.\n";
                        model.title1 = "Caves at Gris Gris";
                        model.image1 = R.drawable.grisgris_2;
                        model.text2 = "In addition to the cave on the far left side of the beach, two other hidden caves can be discovered at Gris Gris. These are more challenging to reach, involving a descent down a cliff and walking through the water.\n" +
                                "Caution is advised against going all the way down, as water levels can fluctuate unpredictably, and the current is often too strong.\n" +
                                "For those eager to explore the secret caves at Gris Gris, head towards the cliff's edge directly across from the parking lot. Upon reaching the spot, descend only about halfway to catch a glimpse of the caves on your right.\n" +
                                "It'simportant to bear in mind that entering the caves could pose risks if the water level rises!\n" +
                                "Gris Gris beach is intricately connected to the village of Souillac, which relies heavily on tourism for its revenue. Established 200 years ago as a port for ships sailing from Europe to India, Souillac has a rich history worth exploring. Plan your day strategically to make the most of your visit to the southern part of Mauritius, and consider including a visit to Rochester Falls, just outside the village, renowned for its distinctive rectangular-sided rocks.\n";                 model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 5) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.black_river_georges_2;
                        model.text1 = "Black River Gorges National Park, located in the hilly southwestern region of Mauritius, was officially established on June 15, 1994, and is under the management of the National Parks and Conservation Service. Encompassing a total area of 67.54 km², the park features diverse habitats, including humid upland forests, drier lowland forests, and marshy heathlands. Visitor facilities within the park comprise two information centers, picnic areas, and an extensive network of 60 kilometers of trails. Additionally, there are four field stations dedicated to research and conservation projects conducted by the National Parks and Conservation Service and the Mauritian Wildlife Foundation.<br>" +
                                "The primary aim of the park is to safeguard a significant portion of the island's remaining rainforest, even though parts of it have suffered degradation due to the introduction of non-native plants like Chinese guava and privet, as well as the presence of invasive animals such as the rusa deer and wild pigs. To preserve native wildlife, specific areas within the park have been cordoned off, and efforts have been made to eliminate invasive species. <br>";
                        model.title1 = "";
                        model.image1 = R.drawable.fody;
                        model.text2 = "Despite the challenges, the park continues to host a variety of endemic plants and animals, including the Mauritian flying fox and all endemic bird species on the island: Mauritius kestrel, pink pigeon, Mauritius parakeet, Mauritius cuckooshrike, Mauritius bulbul, Mauritius olive white-eye, Mauritius grey white-eye, and Mauritius fody. Recognized as an Important Bird Area by BirdLife International, Black River Gorges National Park plays a crucial role in the conservation of Mauritius' unique biodiversity.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 6) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.chamarel_2;
                        model.text1 = "The Seven Coloured Earths form a geological wonder and a popular tourist destination situated in the Chamarel plain of the Rivière Noire District in southwestern Mauritius. This unique site encompasses small sand dunes exhibiting seven distinctive colors—red, brown, violet, green, blue, purple, and yellow. The remarkable characteristic of this location lies in the settling of differently colored sands in distinct layers, creating surrealistic and striped patterns on the dunes. Over time, rains have sculpted captivating designs into the hillside, resulting in an effect reminiscent of earthen meringue.<br>" +
                                "These sands originate from the decomposition of volcanic rock (basalt) gullies into clay, later transformed into ferralitic soil through total hydrolysis. The primary elements responsible for the red/anthracite and blue/purplish colors are iron and aluminum, respectively. The various hues are thought to be a consequence of the molten volcanic rock cooling down at different external temperatures, although the specific causes of their consistent and spontaneous separation are not fully understood.<br>" +
                                "The term \"Seven Coloured Earths\" serves as a descriptive, rather than an official, name. Various versions, including \"Chamarel Seven Coloured Earths,\" \"Chamarel Coloured Earth(s),\" \"Coloured Earth,\" and Terres des Sept Couleurs in French, have been reported.<br>" +
                                "This phenomenon can be replicated on a smaller scale by taking sands of different colors, mixing them together, and observing their eventual separation into a layered spectrum.<br>" +
                                "Since the 1960s, this site has evolved into one of Mauritius' major tourist attractions. Presently, the dunes are safeguarded by a wooden fence, and visitors are prohibited from climbing on them. However, observation outposts along the fence allow visitors to enjoy the scenery. Curio shops in the vicinity offer small test tubes containing the colored sands.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }

                }
                else if (Stash.getString("iterneraries_type").equals("Day21")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.pamplemousse_garden;
                        model.text1 = "The Sir Seewoosagur Ramgoolam Botanic Garden, also known as the Pamplemousses Botanic Garden, is a prominent tourist attraction located in Pamplemousses near Port Louis, Mauritius. It holds the distinction of being the oldest botanical garden in the Southern Hemisphere. Established in 1770 by Pierre Poivre, the garden spans approximately 37 hectares (91 acres) and is renowned for its expansive pond featuring giant water lilies (Victoria amazonica).<br>" + "Throughout its history, the garden underwent various name changes, reflecting its evolving status and ownership. Notable names include 'Jardin de Mon Plaisir,' 'Jardin des Plantes,' 'Le Jardin National de l’Ile de France,' 'Jardin Royal,' 'Jardin Botanique des Pamplemousses,' 'The Royal Botanical Gardens of Pamplemousses,' and 'The Royal Botanic Gardens, Pamplemousses.' Eventually, on September 17, 1988, it was officially named the \"Sir Seewoosagur Ramgoolam Botanic Garden\" in honor of the first prime minister of Mauritius.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.botanical_garden_1;
                        model.text2 = "Beyond the mesmerizing giant water lilies, the garden boasts an assortment of spices, ebonies, sugar canes, and 85 palm varieties sourced from Central America, Asia, Africa, and the Indian Ocean islands. Noteworthy individuals, including Princess Margaret, Countess of Snowdon, Indira Gandhi, François Mitterrand, and Robert Mugabe, have contributed by planting trees within the garden.<br>" + "Situated in the village of Pamplemousses, approximately seven miles northeast of Port Louis, the garden has a rich history dating back to 1729 when it was set aside for colonist P. Barmont. Over the years, it changed hands multiple times, with various owners contributing to its expansion and development. Today, it covers an area of about 25,110 hectares (62,040 acres), with the remaining portion serving as an experimental station.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.botanical_garden_3;
                        model.text4 = "<br>" + "The roots of the Royal Botanic Gardens can be traced to the initiative of Mahé de La Bourdonnais, the first French Governor of Mauritius, in 1735. Initially created as a vegetable garden for his household and the burgeoning township of Port Louis, the garden evolved into a botanical haven. Under Pierre Poivre's directorship in 1768, the garden became a hub for acclimatizing plants from overseas and nurturing crops with economic significance, such as cassava.<br>";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.botanical_garden_2;
                        model.text9 = "Throughout its history, the garden weathered periods of neglect and upheaval, with directors like James Duncan contributing to its restoration and enhancement. In 1866, during a malaria epidemic, the garden played a crucial role in producing Eucalyptus trees to combat the disease.<br>" + "The Department of Agriculture assumed responsibility for the garden in 1913, overseeing its development and maintenance. Notably, following Seewoosagur Ramgoolam's death in 1985, part of the botanical garden was dedicated to a crematorium, marking the first instance of someone being cremated within its grounds.<br>" + "<br>" + "The Sir Seewoosagur Ramgoolam Botanic Garden stands as a testament to Mauritius's botanical heritage, offering visitors a captivating journey through its lush landscapes and rich history.<br>";
                        model.title8 = "Chateau de Mon Plaisir";
                        model.text10 = "";
                        model.image4 = R.drawable.botanical_garden_4;
                        model.text11 = "Until 1839, the Chateau de Mon Plaisir featured a modest structure characterized by a flat roof and circular verandahs. The current single-story building, constructed by the English in the mid-19th century, has been designated as a National Monument, giving it legal protection. Visitors can enjoy a charming panorama of the Moka Range and the Peak of Pieter Both from the Chateau.";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }
                    else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.sugar_museum_pamplemousses;
                        model.text1 = "Located not too far from the Pamplemousse Botanical Garden, amidst a picturesque setting featuring a bougainvillea and coconut tree-lined alley, a pond surrounded by lush greenery, stands the impressively renovated sugar mill—a truly spectacular attraction on the island!\n" +
                                "From the moment the Dutch set foot in Mauritius and introduced sugar canes to the island, the sugar industry has played a significant role in the island's history. At L'Aventure du Sucre, you'll delve into the intricacies of the sugar-making process and explore the colonial past that has profoundly shaped Mauritius into what it is today. Traverse a 250-year historical journey within the museum, a former operational sugar factory, and conclude your tour with a delightful sugar tasting experience, along with sampling various products derived from the golden era of colonial centuries.\n";
                        model.title1 = "";
                        model.image1 = R.drawable.laventure_du_sucre;
                        model.text2 ="Embark on your museum tour by delving into the history of sugar plantations in Mauritius. Gain insights into the Dutch era, succeeded by the French and eventually the English colonists. Following this historical exploration, proceed to the operational factory, which remained active until the 1970s. Immerse yourself in the intricate stages of the sugar-making process showcased in vivid detail. Complement your visit to L'Aventure du Sucre by exploring the Village Boutik for gift shopping and souvenirs. Alternatively, enjoy a delightful pause at Restaurant Le Fangourin, savoring the nuances of Mauritian cuisine.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }

                    else if (position == 2) {
                        Toast.makeText(context, "data is not yet added", Toast.LENGTH_SHORT).show();
                    }
                    else if (position == 3) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.aapravasi_ghat_1;
                        model.text1 = "The Aapravasi Ghat is a historical site located in Port Louis, the capital city of Mauritius. It holds great significance in the history of the island and is recognized as a UNESCO World Heritage Site. The history of the Aapravasi Ghat is closely tied to the indentured labor system that shaped the social and economic landscape of Mauritius.<br>" + "Here is a brief history of the Aapravasi Ghat:<br>" + "1.\t<b>Indentured Labor System:</b> In the 19th century, after the abolition of slavery, the British turned to the system of indentured labor to meet the demand for cheap and abundant workforce for their colonies. Indentured laborers were recruited from various parts of India, as well as China and Africa, to work on plantations in Mauritius and other British colonies.<br>" + "2.\t<b>Establishment of Aapravasi Ghat:</b> The Aapravasi Ghat was established in 1849 as the first site for the reception of indentured laborers in Mauritius. The name \"Aapravasi Ghat\" translates to \"immigration depot\" in Hindi. The location served as a processing center where indentured laborers arriving by ship were registered, housed temporarily, and assigned to various plantations across the island.<br>" + "3.\t<b>Living Conditions:</b> Indentured laborers faced harsh living conditions at the Aapravasi Ghat. They were often crowded into cramped barracks, and the site became a place where many experienced suffering, sickness, and death. The conditions were challenging, and the laborers endured a difficult transition from their home countries to the unfamiliar environment of Mauritius.<br>" + "4.\t<b>End of Indenture:</b> The indenture system continued until the early 20th century when it was officially abolished. The Aapravasi Ghat continued to be used for processing immigrants until 1920. After the cessation of the indenture system, the site underwent various transformations, serving different purposes over the years.<br>" + "5.\t<b>UNESCO World Heritage Site:</b> In 2006, the Aapravasi Ghat was designated as a UNESCO World Heritage Site in recognition of its historical importance in the global migration of indentured laborers and its impact on the multicultural identity of Mauritius.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.aapravasi_ghat_2;
                        model.text2 = "indentured laborers who played a crucial role in shaping the cultural and social fabric of Mauritius. The site is open to visitors, allowing them to explore its history and gain insights into this critical period in the island's past.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }
                    else if (position == 4) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.blue_penny_museum_2;
                        model.text1 = "The Blue Penny Museum in Mauritius was inaugurated in November 2001 and is dedicated to showcasing the history and art of the island. Its name is derived from the famous 1847 Blue Penny and Red Penny stamps, which hold great historical significance.<br>" + "Here's a brief history of the Blue Penny Museum:<br>" + "1.\t<b>Stamp Acquisition (1993):</b> The museum's centerpiece is the 1847 Blue Penny and Red Penny stamps, considered some of the rarest and most valuable stamps in the world. In 1993, a consortium of Mauritian enterprises, led by The Mauritius Commercial Bank, purchased the stamps for $2,000,000. These stamps were then repatriated to Mauritius, marking their return to the island after nearly 150 years.<br>" + "2.\t<b>Museum Inauguration (2001):</b> The Blue Penny Museum officially opened its doors to the public in November 2001. It was established as a cultural institution aimed at preserving and showcasing Mauritius's rich history and artistic heritage.<br>" + "3.\t<b>Conservation Efforts:</b> Given the extreme rarity and value of the Blue Penny stamps, conservation efforts were implemented. The originals are illuminated only temporarily to prevent damage from prolonged exposure. Visitors to the museum typically view replicas of the stamps, ensuring the long-term preservation of the priceless artifacts.<br>" + "4.\t<b>Founder - The Mauritius Commercial Bank:</b> The museum was founded by The Mauritius Commercial Bank, one of the leading financial institutions in Mauritius. This initiative reflects the bank's commitment to preserving and promoting the cultural heritage of the island.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.blue_penny_museum_1;
                        model.text2 = "5.\t<b>Additional Artifacts: In addition to the Blue Penny stamps, the museum houses other notable artifacts, including the original statue of Paul and Virginia. Crafted by Prosper d'Épinay in 1881, this statue adds to the cultural and artistic richness of the museum's collection.<br>" + "The Blue Penny Museum has become a significant cultural institution in Mauritius, attracting both locals and tourists interested in exploring the island's history through its valuable artifacts and exhibits.<br>" + "The Blue Penny Museum is structured across two floors, each offering distinct features and exhibits:<br>" + "<b>Ground Floor:</b><br>" + "1.\t<b>Souvenir Shop: Visitors are welcomed by a souvenir shop on the ground floor, providing an opportunity to purchase mementos related to the museum and Mauritius.<br>" + "2.\t<b>Temporary Exhibition Room: The ground floor houses a temporary exhibition room, showcasing rotating exhibits that may vary over time, allowing for diverse and dynamic displays.<br>" + "First Floor:<br>" + "1.\t<b>The Age of Discovery:</b> This exhibition room narrates the stories of pioneers who undertook the first oceanic voyages to reach the Mascarene Islands. It prominently features ancient maps that document this historic journey.<br>" + "2.\t<b>The Island Builders:</b> Covering three significant periods in Mauritius's history—the Dutch Period, the French Period, and the English Taking Over—this room provides a comprehensive overview of the island's historical evolution.<br>" + "3.\t<b>Port Louis:</b> This exhibition room focuses on the origins and history of Port Louis, offering insights into the development and growth of the city.<br>" + "4.\t<b>The Postal Adventure:</b> Dedicated to the postal history of Mauritius, this room proudly displays two stamps from the renowned Blue Penny collection, contributing to the island's philatelic heritage.<br>" + "5.\t<b>Engraved Memory:</b> Honoring Joseph Osmond Barnard, the first individual to engrave stamps in Mauritius, this room serves as a tribute to his significant contributions to the field.<br>" + "Overall, the Blue Penny Museum is thoughtfully organized to provide visitors with a captivating journey through Mauritius's history, art, and unique cultural heritage.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 5) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.black_river_georges_2;
                        model.text1 = "Black River Gorges National Park, located in the hilly southwestern region of Mauritius, was officially established on June 15, 1994, and is under the management of the National Parks and Conservation Service. Encompassing a total area of 67.54 km², the park features diverse habitats, including humid upland forests, drier lowland forests, and marshy heathlands. Visitor facilities within the park comprise two information centers, picnic areas, and an extensive network of 60 kilometers of trails. Additionally, there are four field stations dedicated to research and conservation projects conducted by the National Parks and Conservation Service and the Mauritian Wildlife Foundation.<br>" +
                                "The primary aim of the park is to safeguard a significant portion of the island's remaining rainforest, even though parts of it have suffered degradation due to the introduction of non-native plants like Chinese guava and privet, as well as the presence of invasive animals such as the rusa deer and wild pigs. To preserve native wildlife, specific areas within the park have been cordoned off, and efforts have been made to eliminate invasive species. <br>";
                        model.title1 = "";
                        model.image1 = R.drawable.fody;
                        model.text2 = "Despite the challenges, the park continues to host a variety of endemic plants and animals, including the Mauritian flying fox and all endemic bird species on the island: Mauritius kestrel, pink pigeon, Mauritius parakeet, Mauritius cuckooshrike, Mauritius bulbul, Mauritius olive white-eye, Mauritius grey white-eye, and Mauritius fody. Recognized as an Important Bird Area by BirdLife International, Black River Gorges National Park plays a crucial role in the conservation of Mauritius' unique biodiversity.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 6) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.chamarel_2;
                        model.text1 = "The Seven Coloured Earths form a geological wonder and a popular tourist destination situated in the Chamarel plain of the Rivière Noire District in southwestern Mauritius. This unique site encompasses small sand dunes exhibiting seven distinctive colors—red, brown, violet, green, blue, purple, and yellow. The remarkable characteristic of this location lies in the settling of differently colored sands in distinct layers, creating surrealistic and striped patterns on the dunes. Over time, rains have sculpted captivating designs into the hillside, resulting in an effect reminiscent of earthen meringue.<br>" +
                                "These sands originate from the decomposition of volcanic rock (basalt) gullies into clay, later transformed into ferralitic soil through total hydrolysis. The primary elements responsible for the red/anthracite and blue/purplish colors are iron and aluminum, respectively. The various hues are thought to be a consequence of the molten volcanic rock cooling down at different external temperatures, although the specific causes of their consistent and spontaneous separation are not fully understood.<br>" +
                                "The term \"Seven Coloured Earths\" serves as a descriptive, rather than an official, name. Various versions, including \"Chamarel Seven Coloured Earths,\" \"Chamarel Coloured Earth(s),\" \"Coloured Earth,\" and Terres des Sept Couleurs in French, have been reported.<br>" +
                                "This phenomenon can be replicated on a smaller scale by taking sands of different colors, mixing them together, and observing their eventual separation into a layered spectrum.<br>" +
                                "Since the 1960s, this site has evolved into one of Mauritius' major tourist attractions. Presently, the dunes are safeguarded by a wooden fence, and visitors are prohibited from climbing on them. However, observation outposts along the fence allow visitors to enjoy the scenery. Curio shops in the vicinity offer small test tubes containing the colored sands.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }

                }
                else if (Stash.getString("iterneraries_type").equals("Day22")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.pamplemousse_garden;
                        model.text1 = "The Sir Seewoosagur Ramgoolam Botanic Garden, also known as the Pamplemousses Botanic Garden, is a prominent tourist attraction located in Pamplemousses near Port Louis, Mauritius. It holds the distinction of being the oldest botanical garden in the Southern Hemisphere. Established in 1770 by Pierre Poivre, the garden spans approximately 37 hectares (91 acres) and is renowned for its expansive pond featuring giant water lilies (Victoria amazonica).<br>" + "Throughout its history, the garden underwent various name changes, reflecting its evolving status and ownership. Notable names include 'Jardin de Mon Plaisir,' 'Jardin des Plantes,' 'Le Jardin National de l’Ile de France,' 'Jardin Royal,' 'Jardin Botanique des Pamplemousses,' 'The Royal Botanical Gardens of Pamplemousses,' and 'The Royal Botanic Gardens, Pamplemousses.' Eventually, on September 17, 1988, it was officially named the \"Sir Seewoosagur Ramgoolam Botanic Garden\" in honor of the first prime minister of Mauritius.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.botanical_garden_1;
                        model.text2 = "Beyond the mesmerizing giant water lilies, the garden boasts an assortment of spices, ebonies, sugar canes, and 85 palm varieties sourced from Central America, Asia, Africa, and the Indian Ocean islands. Noteworthy individuals, including Princess Margaret, Countess of Snowdon, Indira Gandhi, François Mitterrand, and Robert Mugabe, have contributed by planting trees within the garden.<br>" + "Situated in the village of Pamplemousses, approximately seven miles northeast of Port Louis, the garden has a rich history dating back to 1729 when it was set aside for colonist P. Barmont. Over the years, it changed hands multiple times, with various owners contributing to its expansion and development. Today, it covers an area of about 25,110 hectares (62,040 acres), with the remaining portion serving as an experimental station.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.botanical_garden_3;
                        model.text4 = "<br>" + "The roots of the Royal Botanic Gardens can be traced to the initiative of Mahé de La Bourdonnais, the first French Governor of Mauritius, in 1735. Initially created as a vegetable garden for his household and the burgeoning township of Port Louis, the garden evolved into a botanical haven. Under Pierre Poivre's directorship in 1768, the garden became a hub for acclimatizing plants from overseas and nurturing crops with economic significance, such as cassava.<br>";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.botanical_garden_2;
                        model.text9 = "Throughout its history, the garden weathered periods of neglect and upheaval, with directors like James Duncan contributing to its restoration and enhancement. In 1866, during a malaria epidemic, the garden played a crucial role in producing Eucalyptus trees to combat the disease.<br>" + "The Department of Agriculture assumed responsibility for the garden in 1913, overseeing its development and maintenance. Notably, following Seewoosagur Ramgoolam's death in 1985, part of the botanical garden was dedicated to a crematorium, marking the first instance of someone being cremated within its grounds.<br>" + "<br>" + "The Sir Seewoosagur Ramgoolam Botanic Garden stands as a testament to Mauritius's botanical heritage, offering visitors a captivating journey through its lush landscapes and rich history.<br>";
                        model.title8 = "Chateau de Mon Plaisir";
                        model.text10 = "";
                        model.image4 = R.drawable.botanical_garden_4;
                        model.text11 = "Until 1839, the Chateau de Mon Plaisir featured a modest structure characterized by a flat roof and circular verandahs. The current single-story building, constructed by the English in the mid-19th century, has been designated as a National Monument, giving it legal protection. Visitors can enjoy a charming panorama of the Moka Range and the Peak of Pieter Both from the Chateau.";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.grand_bassin_1;
                        model.text1 = "Grand Bassin, also known as Ganga Talao, is located in the Savanne quiet mountain area. It's a crater lake about 550 meters above sea level. The first group of people to visit Ganga Talao was from the village of Triolet, led by Pandit Giri Gossayne in 1898. This place is sacred to Hindus in Mauritius.<br>" +
                                "The Shiv Mandir is on the lake's bank and is dedicated to Shiva. During Shivaratri, around half a million Hindus in Mauritius go on a pilgrimage to the lake, with many walking barefoot from their homes carrying Kanvars.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.grand_bassin_2;
                        model.text2 = "The name Ganga Talao means \"Lake of Ganga,\" connecting it symbolically to the Indian river Ganga (Ganges).<br>" +
                                "<b>History</b><br>" +
                                "In 1866, Pandit Sanjibonlal returned to Mauritius from India after his first contract and turned Grand Bassin into a pilgrimage place. He converted a building into a temple and brought a Shivalingam from India. <br>" +
                                "In 1897, Jhummon Giri Gosagne Napal, a priest, had a dream about the water of Grand Bassin being part of Ganga. The lake was then known as \"Pari Talao,\" and in 1998, it was declared a \"sacred lake.\" In 1972, Ganga water from the Ganges River was mixed with the lake water, and it was renamed Ganga Talao.<br>" +
                                "<b>Events</b><br>" +
                                "During Maha Shivaratri, devotees start a journey on foot to Grand Bassin, and volunteers offer food and drinks to the pilgrims. The lake hosts a 33-meter-tall statue of Shiva called Mangal Mahadev, inaugurated in 2007. Durga Pooja and Navaratri are celebrated grandly near the statue, and Shiva Ratri is a national holiday celebrated auspiciously by Hindus in Mauritius.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 2) {

                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.bois_cheri_1;
                        model.text1 = "The Bois Cheri Plantation was established in 1892 and since then has become the largest tea producer in the country. Covering more than 250 hectares, it includes a museum and a factory where visitors can learn all about the art and science of tea.<br>" + "When you visit the tea estate, you can join guided tours to explore the factory, see the museum and plantation, and even try some tea tasting. Your guide will share the history and stories of Bois Chéri and explain how important tea production is for Mauritius.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.bois_cheri_8;
                        model.text2 = "If you enjoy tea and nature, this tour is a must. The plantation is close to the museum and the main factory, surrounded by lush greenery. The peaceful setting provides a perfect backdrop for relaxation.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.bois_cheri_6;
                        model.text4 = "Aside from the beautiful tea plantation, you'll enjoy picturesque views of the South coast on one side and a stunning crater lake on the other. Driving around is delightful, with spots to stop and capture photos of the lake, unique trees, and tea plantations from different angles.";
                        model.title3 = "The factory and Museum";
                        model.text5 = "The museum provides lots of information about Mauritian tea history, showcasing old machines used in tea production, including an old locomotive train. The factory tour allows you to see the tea-making process in action. Bois Cheri produces both green and black tea, with their signature being vanilla tea.";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.bois_cheri_7;
                        model.text9 = "After your museum and factory adventure, it's time for tea tasting. Head to the factory café near the restaurant to try various teas. You can also purchase waffles or pancakes to enjoy with your tea.<br>" + "The Bois Cheri restaurant is within walking distance and offers breathtaking views of the south coast. The restaurant serves unique cuisines, including local flavors. You'll have the chance to taste dishes like shrimps with green tea and chicken with exotic tea. Whether you visit with friends or family, the restaurant and the entire tour offer a delightful experience with delicious food, scenic views, and soothing music.<br>";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.bois_cheri_4;
                        model.text11 = "<b>Visit Hours</b><br>" + " <br>" + "Monday to Friday:<br><br>" + "09.00 - 14.00<br><br>" + "Saturday:<br><br>" + "09.00 - 11.00<br><br>" + "<b>Bois Chéri Tea FactoryOperating Hours</b><br><br>" + "Monday - Friday 09.00 - 14.00 & Saturday 09.00 - 11.00 (closed on Sundays & public holidays)<br> ";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }
//                    TODO change
                    else if (position == 3) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.la_vanilla_1;
                        model.text1 = "Discover the native plants and animals of Mauritius and its neighboring islands at La Vanille Nature Park. You may see Nile Crocodiles, tenrecs, eels, iguanas, and turtles from Madagascar and the Seychelles among the reserve's wildlife under the shade of large bamboo and palm trees.";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 4) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.gris_gris_1;
                        model.text1 = "The primary beach area features an expansive green field with a commanding view of dramatic cliffs and enormous waves. There are benches and a pavilion available for relaxation while taking in the scenery.\n" +
                                "To the left, a concrete staircase descends to the beach, but swimming is strongly discouraged due to the high danger level. The powerful waves can swiftly overwhelm swimmers. Instead, enjoy a leisurely stroll along the beach, heading toward a small cave at the far end.\n";
                        model.title1 = "Caves at Gris Gris";
                        model.image1 = R.drawable.grisgris_2;
                        model.text2 = "In addition to the cave on the far left side of the beach, two other hidden caves can be discovered at Gris Gris. These are more challenging to reach, involving a descent down a cliff and walking through the water.\n" +
                                "Caution is advised against going all the way down, as water levels can fluctuate unpredictably, and the current is often too strong.\n" +
                                "For those eager to explore the secret caves at Gris Gris, head towards the cliff's edge directly across from the parking lot. Upon reaching the spot, descend only about halfway to catch a glimpse of the caves on your right.\n" +
                                "It'simportant to bear in mind that entering the caves could pose risks if the water level rises!\n" +
                                "Gris Gris beach is intricately connected to the village of Souillac, which relies heavily on tourism for its revenue. Established 200 years ago as a port for ships sailing from Europe to India, Souillac has a rich history worth exploring. Plan your day strategically to make the most of your visit to the southern part of Mauritius, and consider including a visit to Rochester Falls, just outside the village, renowned for its distinctive rectangular-sided rocks.\n";                 model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 5) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.black_river_georges_2;
                        model.text1 = "Black River Gorges National Park, located in the hilly southwestern region of Mauritius, was officially established on June 15, 1994, and is under the management of the National Parks and Conservation Service. Encompassing a total area of 67.54 km², the park features diverse habitats, including humid upland forests, drier lowland forests, and marshy heathlands. Visitor facilities within the park comprise two information centers, picnic areas, and an extensive network of 60 kilometers of trails. Additionally, there are four field stations dedicated to research and conservation projects conducted by the National Parks and Conservation Service and the Mauritian Wildlife Foundation.<br>" +
                                "The primary aim of the park is to safeguard a significant portion of the island's remaining rainforest, even though parts of it have suffered degradation due to the introduction of non-native plants like Chinese guava and privet, as well as the presence of invasive animals such as the rusa deer and wild pigs. To preserve native wildlife, specific areas within the park have been cordoned off, and efforts have been made to eliminate invasive species. <br>";
                        model.title1 = "";
                        model.image1 = R.drawable.fody;
                        model.text2 = "Despite the challenges, the park continues to host a variety of endemic plants and animals, including the Mauritian flying fox and all endemic bird species on the island: Mauritius kestrel, pink pigeon, Mauritius parakeet, Mauritius cuckooshrike, Mauritius bulbul, Mauritius olive white-eye, Mauritius grey white-eye, and Mauritius fody. Recognized as an Important Bird Area by BirdLife International, Black River Gorges National Park plays a crucial role in the conservation of Mauritius' unique biodiversity.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 6) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.chamarel_2;
                        model.text1 = "The Seven Coloured Earths form a geological wonder and a popular tourist destination situated in the Chamarel plain of the Rivière Noire District in southwestern Mauritius. This unique site encompasses small sand dunes exhibiting seven distinctive colors—red, brown, violet, green, blue, purple, and yellow. The remarkable characteristic of this location lies in the settling of differently colored sands in distinct layers, creating surrealistic and striped patterns on the dunes. Over time, rains have sculpted captivating designs into the hillside, resulting in an effect reminiscent of earthen meringue.<br>" +
                                "These sands originate from the decomposition of volcanic rock (basalt) gullies into clay, later transformed into ferralitic soil through total hydrolysis. The primary elements responsible for the red/anthracite and blue/purplish colors are iron and aluminum, respectively. The various hues are thought to be a consequence of the molten volcanic rock cooling down at different external temperatures, although the specific causes of their consistent and spontaneous separation are not fully understood.<br>" +
                                "The term \"Seven Coloured Earths\" serves as a descriptive, rather than an official, name. Various versions, including \"Chamarel Seven Coloured Earths,\" \"Chamarel Coloured Earth(s),\" \"Coloured Earth,\" and Terres des Sept Couleurs in French, have been reported.<br>" +
                                "This phenomenon can be replicated on a smaller scale by taking sands of different colors, mixing them together, and observing their eventual separation into a layered spectrum.<br>" +
                                "Since the 1960s, this site has evolved into one of Mauritius' major tourist attractions. Presently, the dunes are safeguarded by a wooden fence, and visitors are prohibited from climbing on them. However, observation outposts along the fence allow visitors to enjoy the scenery. Curio shops in the vicinity offer small test tubes containing the colored sands.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }

                }
                else if (Stash.getString("iterneraries_type").equals("Day23")) {
                    if (position == 0) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.pamplemousse_garden;
                        model.text1 = "The Sir Seewoosagur Ramgoolam Botanic Garden, also known as the Pamplemousses Botanic Garden, is a prominent tourist attraction located in Pamplemousses near Port Louis, Mauritius. It holds the distinction of being the oldest botanical garden in the Southern Hemisphere. Established in 1770 by Pierre Poivre, the garden spans approximately 37 hectares (91 acres) and is renowned for its expansive pond featuring giant water lilies (Victoria amazonica).<br>" + "Throughout its history, the garden underwent various name changes, reflecting its evolving status and ownership. Notable names include 'Jardin de Mon Plaisir,' 'Jardin des Plantes,' 'Le Jardin National de l’Ile de France,' 'Jardin Royal,' 'Jardin Botanique des Pamplemousses,' 'The Royal Botanical Gardens of Pamplemousses,' and 'The Royal Botanic Gardens, Pamplemousses.' Eventually, on September 17, 1988, it was officially named the \"Sir Seewoosagur Ramgoolam Botanic Garden\" in honor of the first prime minister of Mauritius.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.botanical_garden_1;
                        model.text2 = "Beyond the mesmerizing giant water lilies, the garden boasts an assortment of spices, ebonies, sugar canes, and 85 palm varieties sourced from Central America, Asia, Africa, and the Indian Ocean islands. Noteworthy individuals, including Princess Margaret, Countess of Snowdon, Indira Gandhi, François Mitterrand, and Robert Mugabe, have contributed by planting trees within the garden.<br>" + "Situated in the village of Pamplemousses, approximately seven miles northeast of Port Louis, the garden has a rich history dating back to 1729 when it was set aside for colonist P. Barmont. Over the years, it changed hands multiple times, with various owners contributing to its expansion and development. Today, it covers an area of about 25,110 hectares (62,040 acres), with the remaining portion serving as an experimental station.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.botanical_garden_3;
                        model.text4 = "<br>" + "The roots of the Royal Botanic Gardens can be traced to the initiative of Mahé de La Bourdonnais, the first French Governor of Mauritius, in 1735. Initially created as a vegetable garden for his household and the burgeoning township of Port Louis, the garden evolved into a botanical haven. Under Pierre Poivre's directorship in 1768, the garden became a hub for acclimatizing plants from overseas and nurturing crops with economic significance, such as cassava.<br>";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.botanical_garden_2;
                        model.text9 = "Throughout its history, the garden weathered periods of neglect and upheaval, with directors like James Duncan contributing to its restoration and enhancement. In 1866, during a malaria epidemic, the garden played a crucial role in producing Eucalyptus trees to combat the disease.<br>" + "The Department of Agriculture assumed responsibility for the garden in 1913, overseeing its development and maintenance. Notably, following Seewoosagur Ramgoolam's death in 1985, part of the botanical garden was dedicated to a crematorium, marking the first instance of someone being cremated within its grounds.<br>" + "<br>" + "The Sir Seewoosagur Ramgoolam Botanic Garden stands as a testament to Mauritius's botanical heritage, offering visitors a captivating journey through its lush landscapes and rich history.<br>";
                        model.title8 = "Chateau de Mon Plaisir";
                        model.text10 = "";
                        model.image4 = R.drawable.botanical_garden_4;
                        model.text11 = "Until 1839, the Chateau de Mon Plaisir featured a modest structure characterized by a flat roof and circular verandahs. The current single-story building, constructed by the English in the mid-19th century, has been designated as a National Monument, giving it legal protection. Visitors can enjoy a charming panorama of the Moka Range and the Peak of Pieter Both from the Chateau.";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 1) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.grand_bassin_1;
                        model.text1 = "Grand Bassin, also known as Ganga Talao, is located in the Savanne quiet mountain area. It's a crater lake about 550 meters above sea level. The first group of people to visit Ganga Talao was from the village of Triolet, led by Pandit Giri Gossayne in 1898. This place is sacred to Hindus in Mauritius.<br>" +
                                "The Shiv Mandir is on the lake's bank and is dedicated to Shiva. During Shivaratri, around half a million Hindus in Mauritius go on a pilgrimage to the lake, with many walking barefoot from their homes carrying Kanvars.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.grand_bassin_2;
                        model.text2 = "The name Ganga Talao means \"Lake of Ganga,\" connecting it symbolically to the Indian river Ganga (Ganges).<br>" +
                                "<b>History</b><br>" +
                                "In 1866, Pandit Sanjibonlal returned to Mauritius from India after his first contract and turned Grand Bassin into a pilgrimage place. He converted a building into a temple and brought a Shivalingam from India. <br>" +
                                "In 1897, Jhummon Giri Gosagne Napal, a priest, had a dream about the water of Grand Bassin being part of Ganga. The lake was then known as \"Pari Talao,\" and in 1998, it was declared a \"sacred lake.\" In 1972, Ganga water from the Ganges River was mixed with the lake water, and it was renamed Ganga Talao.<br>" +
                                "<b>Events</b><br>" +
                                "During Maha Shivaratri, devotees start a journey on foot to Grand Bassin, and volunteers offer food and drinks to the pilgrims. The lake hosts a 33-meter-tall statue of Shiva called Mangal Mahadev, inaugurated in 2007. Durga Pooja and Navaratri are celebrated grandly near the statue, and Shiva Ratri is a national holiday celebrated auspiciously by Hindus in Mauritius.<br>";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 2) {

                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.bois_cheri_1;
                        model.text1 = "The Bois Cheri Plantation was established in 1892 and since then has become the largest tea producer in the country. Covering more than 250 hectares, it includes a museum and a factory where visitors can learn all about the art and science of tea.<br>" + "When you visit the tea estate, you can join guided tours to explore the factory, see the museum and plantation, and even try some tea tasting. Your guide will share the history and stories of Bois Chéri and explain how important tea production is for Mauritius.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.bois_cheri_8;
                        model.text2 = "If you enjoy tea and nature, this tour is a must. The plantation is close to the museum and the main factory, surrounded by lush greenery. The peaceful setting provides a perfect backdrop for relaxation.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.bois_cheri_6;
                        model.text4 = "Aside from the beautiful tea plantation, you'll enjoy picturesque views of the South coast on one side and a stunning crater lake on the other. Driving around is delightful, with spots to stop and capture photos of the lake, unique trees, and tea plantations from different angles.";
                        model.title3 = "The factory and Museum";
                        model.text5 = "The museum provides lots of information about Mauritian tea history, showcasing old machines used in tea production, including an old locomotive train. The factory tour allows you to see the tea-making process in action. Bois Cheri produces both green and black tea, with their signature being vanilla tea.";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.bois_cheri_7;
                        model.text9 = "After your museum and factory adventure, it's time for tea tasting. Head to the factory café near the restaurant to try various teas. You can also purchase waffles or pancakes to enjoy with your tea.<br>" + "The Bois Cheri restaurant is within walking distance and offers breathtaking views of the south coast. The restaurant serves unique cuisines, including local flavors. You'll have the chance to taste dishes like shrimps with green tea and chicken with exotic tea. Whether you visit with friends or family, the restaurant and the entire tour offer a delightful experience with delicious food, scenic views, and soothing music.<br>";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.bois_cheri_4;
                        model.text11 = "<b>Visit Hours</b><br>" + " <br>" + "Monday to Friday:<br><br>" + "09.00 - 14.00<br><br>" + "Saturday:<br><br>" + "09.00 - 11.00<br><br>" + "<b>Bois Chéri Tea FactoryOperating Hours</b><br><br>" + "Monday - Friday 09.00 - 14.00 & Saturday 09.00 - 11.00 (closed on Sundays & public holidays)<br> ";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }
//                    TODO change
                    else if (position == 3) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.la_vanilla_1;
                        model.text1 = "Discover the native plants and animals of Mauritius and its neighboring islands at La Vanille Nature Park. You may see Nile Crocodiles, tenrecs, eels, iguanas, and turtles from Madagascar and the Seychelles among the reserve's wildlife under the shade of large bamboo and palm trees.";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 4) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.gris_gris_1;
                        model.text1 = "The primary beach area features an expansive green field with a commanding view of dramatic cliffs and enormous waves. There are benches and a pavilion available for relaxation while taking in the scenery.\n" +
                                "To the left, a concrete staircase descends to the beach, but swimming is strongly discouraged due to the high danger level. The powerful waves can swiftly overwhelm swimmers. Instead, enjoy a leisurely stroll along the beach, heading toward a small cave at the far end.\n";
                        model.title1 = "Caves at Gris Gris";
                        model.image1 = R.drawable.grisgris_2;
                        model.text2 = "In addition to the cave on the far left side of the beach, two other hidden caves can be discovered at Gris Gris. These are more challenging to reach, involving a descent down a cliff and walking through the water.\n" +
                                "Caution is advised against going all the way down, as water levels can fluctuate unpredictably, and the current is often too strong.\n" +
                                "For those eager to explore the secret caves at Gris Gris, head towards the cliff's edge directly across from the parking lot. Upon reaching the spot, descend only about halfway to catch a glimpse of the caves on your right.\n" +
                                "It'simportant to bear in mind that entering the caves could pose risks if the water level rises!\n" +
                                "Gris Gris beach is intricately connected to the village of Souillac, which relies heavily on tourism for its revenue. Established 200 years ago as a port for ships sailing from Europe to India, Souillac has a rich history worth exploring. Plan your day strategically to make the most of your visit to the southern part of Mauritius, and consider including a visit to Rochester Falls, just outside the village, renowned for its distinctive rectangular-sided rocks.\n";                 model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 5) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.black_river_georges_2;
                        model.text1 = "Black River Gorges National Park, located in the hilly southwestern region of Mauritius, was officially established on June 15, 1994, and is under the management of the National Parks and Conservation Service. Encompassing a total area of 67.54 km², the park features diverse habitats, including humid upland forests, drier lowland forests, and marshy heathlands. Visitor facilities within the park comprise two information centers, picnic areas, and an extensive network of 60 kilometers of trails. Additionally, there are four field stations dedicated to research and conservation projects conducted by the National Parks and Conservation Service and the Mauritian Wildlife Foundation.<br>" +
                                "The primary aim of the park is to safeguard a significant portion of the island's remaining rainforest, even though parts of it have suffered degradation due to the introduction of non-native plants like Chinese guava and privet, as well as the presence of invasive animals such as the rusa deer and wild pigs. To preserve native wildlife, specific areas within the park have been cordoned off, and efforts have been made to eliminate invasive species. <br>";
                        model.title1 = "";
                        model.image1 = R.drawable.fody;
                        model.text2 = "Despite the challenges, the park continues to host a variety of endemic plants and animals, including the Mauritian flying fox and all endemic bird species on the island: Mauritius kestrel, pink pigeon, Mauritius parakeet, Mauritius cuckooshrike, Mauritius bulbul, Mauritius olive white-eye, Mauritius grey white-eye, and Mauritius fody. Recognized as an Important Bird Area by BirdLife International, Black River Gorges National Park plays a crucial role in the conservation of Mauritius' unique biodiversity.";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    } else if (position == 6) {
                        BeacModel model = new BeacModel();
                        model.title = textView.getText().toString();
                        model.main_image = R.drawable.chamarel_2;
                        model.text1 = "The Seven Coloured Earths form a geological wonder and a popular tourist destination situated in the Chamarel plain of the Rivière Noire District in southwestern Mauritius. This unique site encompasses small sand dunes exhibiting seven distinctive colors—red, brown, violet, green, blue, purple, and yellow. The remarkable characteristic of this location lies in the settling of differently colored sands in distinct layers, creating surrealistic and striped patterns on the dunes. Over time, rains have sculpted captivating designs into the hillside, resulting in an effect reminiscent of earthen meringue.<br>" +
                                "These sands originate from the decomposition of volcanic rock (basalt) gullies into clay, later transformed into ferralitic soil through total hydrolysis. The primary elements responsible for the red/anthracite and blue/purplish colors are iron and aluminum, respectively. The various hues are thought to be a consequence of the molten volcanic rock cooling down at different external temperatures, although the specific causes of their consistent and spontaneous separation are not fully understood.<br>" +
                                "The term \"Seven Coloured Earths\" serves as a descriptive, rather than an official, name. Various versions, including \"Chamarel Seven Coloured Earths,\" \"Chamarel Coloured Earth(s),\" \"Coloured Earth,\" and Terres des Sept Couleurs in French, have been reported.<br>" +
                                "This phenomenon can be replicated on a smaller scale by taking sands of different colors, mixing them together, and observing their eventual separation into a layered spectrum.<br>" +
                                "Since the 1960s, this site has evolved into one of Mauritius' major tourist attractions. Presently, the dunes are safeguarded by a wooden fence, and visitors are prohibited from climbing on them. However, observation outposts along the fence allow visitors to enjoy the scenery. Curio shops in the vicinity offer small test tubes containing the colored sands.<br>";
                        model.title1 = "";
                        model.image1 = R.drawable.map_location;
                        model.text2 = "";
                        model.title2 = "";
                        model.text3 = "";
                        model.image2 = R.drawable.map_location;
                        model.text4 = "";
                        model.title3 = "";
                        model.text5 = "";
                        model.title4 = "";
                        model.text6 = "";
                        model.title5 = "";
                        model.text7 = "";
                        model.title6 = "";
                        model.text8 = "";
                        model.title7 = "";
                        model.image3 = R.drawable.map_location;
                        model.text9 = "";
                        model.title8 = "";
                        model.text10 = "";
                        model.image4 = R.drawable.map_location;
                        model.text11 = "";
                        model.image5 = R.drawable.map_location;
                        model.text12 = "";
                        Stash.put("model", model);
                        intent = new Intent(context, ItenerariesDetails.class);
                        context.startActivity(intent);
                    }

                }

            }
        });
        return itemView;
    }


}
