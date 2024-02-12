package com.moutimid.sqlapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fxn.stash.Stash;
import com.moutimid.sqlapp.R;
import com.moutimid.sqlapp.activities.Beaches.BeachDetails;
import com.moutimid.sqlapp.model.BeacModel;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ViewHolder> {

    private Context context;
    private String[] itemName;
    private int[] itemImages;
    String name;

    public ExploreAdapter(Context context, String[] itemName, int[] itemImages, String name) {
        this.context = context;
        this.itemImages = itemImages;
        this.itemName = itemName;
        this.name = name;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.explore_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(itemImages[position]);
        holder.textView.setText(itemName[position]);
    }

    @Override
    public int getItemCount() {
        return itemName.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.title);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = null;
            if (name.equals("Central")) {
                if (getAdapterPosition() == 0) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bagatelle_mall_1;
                    model.text1 = "The Bagatelle Mall is a premier shopping destination in Mauritius, offering a myriad of options in the realms of shopping, dining, and entertainment. Located in the Moka area, it opened its doors in September of 2011. Boasting an impressive array of over 150 stores, the mall showcases a harmonious blend of internationally renowned brands such as Mango, Zara, and Lacoste alongside cherished local labels. Additional facilities within the mall include a hypermarket, a gastronomic court, a cinema, and a children's play zone.<br>" +
                            "The culinary offerings at Bagatelle Mall of Mauritius are equally diverse, comprising refined restaurants, charming cafes, and fast-food establishments. The food court, a focal point of gastronomic delight, hosts multiple vendors specializing in a plethora of cuisines. Whether one seeks a quick bite or a more leisurely dining experience, the Bagatelle Mall ensures a gastronomic journey to satiate even the most discerning palates. Revered by both locals and tourists alike, the mall has solidified its status as a cultural landmark in Mauritius.<br>" +
                            "Accessing Bagatelle Mall of Mauritius is easy, facilitated by taxi services, or public transportation. For those opting for a personal vehicle, the mall is strategically positioned along the M1 highway, approximately 10 minutes southward from Port Louis, the capital city. The mall has plenty of parking spaces.  Alternatively, taxis or public transport offer convenient alternatives, with multiple bus routes servicing the area and conveniently located stops in close proximity to the mall.<br>";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 1) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bois_cheri_1;
                    model.text1 = "The Bois Cheri Plantation was established in 1892 and since then has become the largest tea producer in the country. Covering more than 250 hectares, it includes a museum and a factory where visitors can learn all about the art and science of tea.<br>" +
                            "When you visit the tea estate, you can join guided tours to explore the factory, see the museum and plantation, and even try some tea tasting. Your guide will share the history and stories of Bois Chéri and explain how important tea production is for Mauritius.<br>";
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
                    model.text9 = "After your museum and factory adventure, it's time for tea tasting. Head to the factory café near the restaurant to try various teas. You can also purchase waffles or pancakes to enjoy with your tea.<br>" +
                            "The Bois Cheri restaurant is within walking distance and offers breathtaking views of the south coast. The restaurant serves unique cuisines, including local flavors. You'll have the chance to taste dishes like shrimps with green tea and chicken with exotic tea. Whether you visit with friends or family, the restaurant and the entire tour offer a delightful experience with delicious food, scenic views, and soothing music.<br>";
                    model.title8 = "";
                    model.text10 = "";
                    model.image4 = R.drawable.bois_cheri_4;
                    model.text11 = "<b>Visit Hours</b><br>" +
                            " <br>" +
                            "Monday to Friday:<br><br>" +
                            "09.00 - 14.00<br><br>" +
                            "Saturday:<br><br>" +
                            "09.00 - 11.00<br><br>" +
                            "<b>Bois Chéri Tea FactoryOperating Hours</b><br><br>" +
                            "Monday - Friday 09.00 - 14.00 & Saturday 09.00 - 11.00 (closed on Sundays & public holidays)<br> ";
                    model.image5 = R.drawable.map_location;
                    model.text12 = "";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 2) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.eureka_house;
                    model.text1 = "If you're looking to explore an attraction that encapsulates Mauritius' rich colonial history, Eureka is the top choice. This meticulously preserved Creole mansion, constructed in the 1830s, now serves as a museum, offering a captivating journey back in time and unveiling the vibrant plantation history of the island. The main manor house stands as a tropical architectural marvel, renowned for maintaining a refreshingly cool interior during the scorching summers. With an impressive count of 109 doors and more rooms than a Cluedo board, it truly showcases exceptional craftsmanship.";
                    model.title1 = "";
                    model.image1 = R.drawable.eureka_house_3;
                    model.text2 = "Inside, rooms are adorned with a flawlessly conserved collection of period furniture imported by the French East India Company. Noteworthy items include antique maps, a peculiar shower contraption that was considered a luxury 150 years ago, and a weathered piano with keys resembling decaying teeth.";
                    model.title2 = "";
                    model.text3 = "";
                    model.image2 = R.drawable.eureka_house_2;
                    model.text4 = "Venturing into the courtyard behind the main mansion reveals beautifully landscaped grounds encompassed by a series of stone cottages, formerly serving as servants' quarters and a kitchen. Following the trail at the back for 15 minutes leads to the picturesque Ravin waterfall.<br>" +
                            "The estate earned its distinctive name when Eugène Le Clézio successfully secured the house through auction in 1856.<br>";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 3) {

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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 4) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.gymkhana_2;
                    model.text1 = "Established in 1844 by the esteemed British Royal Navy, the Gymkhana Club is a testament to the history of golf, ranking as the fourth oldest golf course globally and a distinguished presence in the southern hemisphere. Although comparatively modest in size, this historic course in Vacoas, located at the heart of the island, presents a challenge to golf enthusiasts with its demand for precision and technical prowess.<br>" +
                            "Adorned by century-old trees, the Gymkhana Club looks like a picturesque garden, boasting vibrant hues from bougainvilleas, Gabonese tulips, elms, arocarias, palm trees, and traveler's trees. This unique 18-hole haven is not merely a golf course; it encapsulates an unforgettable experience, steeped in a rich legacy.<br>" +
                            "Acknowledging its historical significance, the Gymkhana Club takes pride in awarding every golfer a certificate, a testament to their participation in a course that has witnessed the sport since its inception in 1844. Despite its relatively compact footprint compared to other Mauritian golf courses, the Gymkhana Club's layout poses challenges that demand precision and skill.<br>" +
                            "While traditionally accessible to Mauritian members, the Gymkhana Club now extends a gracious invitation to golf enthusiasts worldwide. Recognized as the most approachable of the 18 holes, it offers a nominal green fee for non-members and provides a temporary membership solution, ensuring a distinguished golfing experience for all.";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 5) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.le_pouce_1;
                    model.text1 = "Le Pouce is the third highest mountain in Mauritius, soaring to an elevation of 812 meters (2664 feet). Only surpassed in height by Piton de la Petite Rivière Noire (828 m) and Pieter Both (820 m), this mountain derives its name from the distinctive, thumb-shaped apex that graces its summit. It is part of the Moka range which is a dome of basalt lava that is no longer experiencing volcanic activity.";
                    model.title1 = "";
                    model.image1 = R.drawable.le_pouce_2;
                    model.text2 = "This mountain was formerly known as the Mountain of Immortals, a name derived from a plant that persists on its slopes to this very day. Le Pouce Mountain promises an exquisite panorama encompassing Le Morne, Coin de Mire, the capital city, and various other locales strewn across the island. As you climb towards its summit, the mountain unfolds a tapestry of flourishing flora, unveiling exotic specimens and a collection of rare, uniquely indigenous species.It’s worth noting thaton the 2nd of May 1836, Charles Darwin ascended this majestic mountain.";
                    model.title2 = "Trails";
                    model.text3 = "";
                    model.image2 = R.drawable.le_pouce_3;
                    model.text4 = "There are two hiking trails to climb Le Pouce: one from the north side, starting in Port Louis, and the other from the south side, starting in Moka.<br>" +
                            "The southern route, widely embraced by tourists and locals alike, follows a conventional path, starting at a higher elevation and covering less than half the distance of its northern counterpart. While the north route provides superior views, more shaded sections, and a more gradual ascent, it entails a significantly longer journey. <br>" +
                            "<b>Southern Route</b><br>" +
                            "Type of Trail: Out and Back/Through Hike<br>" +
                            "Start Point: Moka Trailhead<br>" +
                            "End Point: Summit<br>" +
                            "Length: 1.4 miles one way<br>" +
                            "Duration: 2 hours one way<br>" +
                            "Lowest Point: 1514 feet<br>" +
                            "Highest Point: 2587 feet<br>" +
                            "Total Elevation Gain: 1165 feet<br>" +
                            "Drive towards the foot of the mountain from Moka, turning off the main road where a Le Pouce sign directs you onto a meandering road through the sugarcane fields. Once you reach the foot of the mountain, proceed along the dirt road towards Le Pouce, following the well-trodden trail that zigzags up the mountainside. As you climb, you'll hike through an open, grassy expanse. Continue along any trail leading towards the summit.<br>" +
                            "The final leg, where you climb \"the thumb,\" presents a relatively steep climb for both approaches, requiring some manual assistance in places. Caution is advised, especially in inclement weather.<br>" +
                            "<b>Northern Route:</b><br>" +
                            "Type of Trail: Out and Back/Through Hike<br>" +
                            "Start Point: Trailhead in Tranquebar<br>" +
                            "End Point: Summit<br>" +
                            "Length: 3.9 miles one way<br>" +
                            "Duration:6 hours one way<br>" +
                            "Lowest Point: 273 feet<br>" +
                            "Highest Point: 2656 feet<br>" +
                            "Total Elevation Gain: 2690 feet<br>" +
                            "Embark on the northern route from the trailhead where Chateau D’eau Street ends. Follow the primary road, gradually climbing toward Le Pouce. Blue and white markings on stones guide the way, ensuring navigation is straightforward. Stay left at various forks along the main road, passing temples and mango trees until you encounter a sign bank on your left. At this point, the trail turns left, narrows, and becomes steeper.<br>" +
                            "The trail will eventually come to a more open, less steep area. Proceed down the main path. Do not follow the one notable fork to the left that crosses a stream. As you approach closer to Le Pouce, the route splits off again, but all of them lead to the summit and eventually converge.<br>" +
                            "The last section, where you climb \"the thumb,\" presents a similar challenge for both routes, demanding manual assistance in certain sections and warranting caution during inclement weather.<br>";
                    model.title3 = "Practical Information";
                    model.text5 = "<b>What to bring: </b>bottled water, food, clothing and appropriate footwear, sunscreen, insect repellent, and a first aid kit<br>" +
                            "<b>Other Tips:</b><br>" +
                            "•\tCarry your trash with you. Avoid leaving trash behind.<br>" +
                            "•\tDon't stray from the trails and don't split up with your group.<br>" +
                            "•\tFor your own safety, avoid feeding untamed animals.<br>" +
                            "•\tDon't harm other plants or trees.<br>";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 6) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.pieter_both_1;
                    model.text1 = "The Pieter Both is one among the most well-known and iconic locations in Mauritius. Postcards from Mauritius frequently include images of its spectacular beauty. Thousands of nature enthusiasts go to the Pieter Both Mountain for its breathtaking views and hiking adventures.An interesting fact is that the palm species Hyophorbe amaricaulis, once a ubiquitous sight on this mountain, is now the world's rarest palmas of 2023 due to a decline in propagation.<br>" +
                            "One of Mauritius' most recognizable mountains, the Pieter Both is visible from practically every south-west and central-northhighways.Itis the second highest mountain in Mauritius standing at 820 meters (2,690 feet). Shorter than Piton de la Petite Rivière Noire by eight meters, this mountain got its name from Pieter Both, the Governor-General of the Dutch East Indies. It is part of the Moka Range and distinguishes itself with a notable feature: a colossal rock formation crowning its summit, evoking the semblance of a human head.<br>";
                    model.title1 = "";
                    model.image1 = R.drawable.pieter_both_2;
                    model.text2 = "Indeed, there is a well-known local mythology associated with this rock. There are rumors that a milkman from Crève Coeur, a village at the base of the mountain, used to sell milk in La Laura and the neighboring communities. He decided one day to go to the next village by using the Pieter Both route shortcut. Feeling tired from his trek, he took a short break to rest. Soon he felt asleep only to be awaked later by the sound of a lovely music.His eyes opened to the sight of mesmerizing fairies singing and dancing. When the fairies realized they were being watched by a mortal, theycursedthe milkman he would turn into a stone if he ever told anyone about what he had seen. Still mesmerized by what he saw and overwhelmed by his experience, he forgot his oath and revealed his encounter with the fairies tohis friends.When themilkman came to the same spotthe following day, the fairies already knew the milkman had not kept the secret. Furious, the fairies transformed him into stone. Severed from his body, the milkman’s head grew larger and transposed onto the summit of the mountain. According to the legend, the milkman's head turned into rock is the one atop the mountain.<br>" +
                            "Folklore aside, the Pieter Both is also well-known for its hiking trails. Hikers of all skill levels can tackle the mountain hike, which ranges from moderately tough to extremely challenging. It is advised that hikers, whether novice or expert, wear helmets, ropes, and harnesses. Guided hiking trips up the Pieter Both can also be arranged through these agencies.<br>" +
                            "The starting point of your climbing journey is in the La Laura village at the base of a mountain. It takes roughly one hour to climb the first 600–650 meters. The climb is moderately demanding and appropriate for hikers with average physical and health conditions. <br>";
                    model.title2 = "";
                    model.text3 = "";
                    model.image2 = R.drawable.pieter_both_3;
                    model.text4 = "If you're the daring type and want to try the unbatteredpath, carry on with the hike.  You will need goodrock-climbingtechniques to get to the mountain's neck. Although climbers still find assistance from the iron rungs set into the rock years ago by the Royal Navy and Special Mobile Force, it is safer to use ropes to climb your way up.<br>" +
                            "Want a more adventurous and challenging route up to the mountain's summit? No problem, there is something available for the brave ones as well. All you will need is some confidence and efforts on your part to climb the nine-meter-diameter boulder. Be aware that climbing the boulder is the hardest part due to the upward steepness.<br>" +
                            "If you choose to climb the mountain in the summer, bring with you water, a hat, sunglass, and sunscreen lotion. Exercise caution when hiking after a rainy day as the walkways become quite slippery.<br>" +
                            "The palm species Hyophorbe amaricaulis, once a ubiquitous sight on this mountain, is now the world's rarest palmas of 2023 due to a decline in propagation.<br>";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 7) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.tamarin_falls_1;
                    model.text1 = "The Tamarind Falls is a picturesque waterfalllocated in the southwestern region of Mauritius. Nestled along the Rivière Tamarin river near the village of Henrietta, these falls boast seven successive tiers of cascades.";
                    model.title1 = "";

                    model.image1 = R.drawable.tamarin_falls_2;
                    model.text2 = "<br>" +
                            "The main waterfall of the Tamarind Falls has an impressive height of 293 meters (961 feet), making it one of the highest waterfalls on the island. Thanks to the lush and diverse flora surrounding the waterfall, the area is one of the most picturesque and serene places in Mauritius. Nature and animal lovers will be delighted to discovermany exotic plants and birds populating the area.<br>" +
                            "Reaching the waterfalls can be a bit challenging though.Indeed, it takes nearly a full day of hiking to access this unspoiled natural marvel. The trail winds its way through the forest and includes a stretch across an open area on the basalt rockwhich is a clear sign you are in the vicinity of the Tamarind falls.<br>" +
                            "Once you reach the waterfall, you can take a well-deserved break and cool off in the basin. Alternatively, you can continue onward to climb to the top of the falls. As you climb up, you will come across a series of small pools and when you reach the top of the waterfall you will be rewarded bythespectacularpanorama of the lush green canyon unfolding in front of your eyes.<br>";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 8) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.trou_aux_cerfs_4;
                    model.text1 = "The Trou aux Cerfs crater is surrounded by a vast expanse of lush forest home toindigenous plant species and some enormous green pine trees. It is thought to have erupted once and been inactive for the past 700 000 years, although scientists believe there may be a chance for it to erupt again.<br>" +
                            "Undoubtedly, one of its main attractions is the panoramic 360-degree view encompassing the town of Curepipe, along with stunning views of Rempart Mountain, Trois Mamelles, and the PortLouis-Moka mountain range.<br>" +
                            "This lush and green verdant sanctuary serves as a favored jogging locale for the locals. Evolving into a social gathering place, it regularly attracts joggers every at around five o’clock in the morning. A gazebo provides a pleasant spot to sit, relax, and appreciate the unparalleled natural beauty. Due to the surrounding woods and elevation, it can become slightly chilly, so it is advisable to bring along a light sweater or shawl.<br>" +
                            "There are three primary access points to Trou aux Cerfs, specifically the La Hausse de la Louviere Road, the Edgar Huges Road, and the Crater Lane. Parking facilities are available.<br>";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                }
            } else if (name.equals("South")) {
                if (getAdapterPosition() == 0) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.gris_gris_coastal_4;
                    model.text1 = "This enchanting havendistinguishes itself by the absence of a coral barrier reef, making it truly unique. The ocean waves vigorously crash against the shoreline, providing captivating vistas for visitors. Gris Gris beach stands in stark contrast to other tranquil and calm beaches in Mauritius, known for their coral reef protection. The island's typical coral reef barrier contributes to calmer ocean waves and shallow beach waters, creating ideal swimming conditions. However, Gris Gris, surprisingly, lacks this barrier reef.";

                    model.title1 = "";
                    model.image1 = R.drawable.gris_gris_3;
                    model.text2 = "A visit to Gris Gris is an absolute essential for anyone exploring Mauritius. The beach's beauty is awe-inspiring, with towering cliffs descending toward the ocean, where turbulent waves crash against rocks, creating a striking white froth accompanied by a resounding crash. Located at the southernmost point of of Mauritius, a few kilometers southeast of the village of Souillac, Gris Gris boasts a unique history dating back to the French colonial era.\n" +
                            "The name \"Gris Gris\" adds an intriguing dimension to the experience. Upon entering the beach, a large sign displays the history behind the name. According to local tradition, \"Gris Gris\" is linked to the African amulet known as the “Gris Gris” and its association with the tumultuous coastline. However, the story takes an unexpected turn, suggesting that Gris Gris might have been the name of a puppy belonging to a French cartographer who visited the coast in 1753.\n";
                    model.title2 = "Gris Gris Beach";
                    model.text3 = "";
                    model.image2 = R.drawable.gris_gris_1;
                    model.text4 = "The primary beach area features an expansive green field with a commanding view of dramatic cliffs and enormous waves. There are benches and a pavilion available for relaxation while taking in the scenery.\n" +
                            "To the left, a concrete staircase descends to the beach, but swimming is strongly discouraged due to the high danger level. The powerful waves can swiftly overwhelm swimmers. Instead, enjoy a leisurely stroll along the beach, heading toward a small cave at the far end.\n";
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
                    model.text9 = "In addition to the cave on the far left side of the beach, two other hidden caves can be discovered at Gris Gris. These are more challenging to reach, involving a descent down a cliff and walking through the water.\n" +
                            "Caution is advised against going all the way down, as water levels can fluctuate unpredictably, and the current is often too strong.\n" +
                            "For those eager to explore the secret caves at Gris Gris, head towards the cliff's edge directly across from the parking lot. Upon reaching the spot, descend only about halfway to catch a glimpse of the caves on your right.\n" +
                            "It's important to bear in mind that entering the caves could pose risks if the water level rises!\n" +
                            "Gris Gris beach is intricately connected to the village of Souillac, which relies heavily on tourism for its revenue. Established 200 years ago as a port for ships sailing from Europe to India, Souillac has a rich history worth exploring. Plan your day strategically to make the most of your visit to the southern part of Mauritius, and consider including a visit to Rochester Falls, just outside the village, renowned for its distinctive rectangular-sided rocks.\n";

                    model.title8 = "La Roche qui Pleure";
                    model.text10 = "";
                    model.image4 = R.drawable.la_roche_qui_pleure;
                    model.text11 = "This mystical site derives its name from the visual impression it creates: as water trickles down its walls, the cliffs appear to shed tears. Even more astonishing, some claim to recognize the eroded features of the Mauritian poet Robert Edward Hart.\n" +
                            "From a geographical and climatic standpoint, unlike other parts of the island, La Roche qui Pleure lacks coral reefs. Consequently, its shores are more exposed to the assaults of the ocean. This absence of a natural barrier results in more powerful and spectacular waves, a stark contrast to the tranquil lagoons typically associated with the island. The region is influenced by strong winds and seasonal variations, shaping its unique landscape and marine dynamics.\n";
                    model.image5 = R.drawable.map_location;
                    model.text12 = "";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 1) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bagatelle_mall_1;
                    model.text1 = "Although Rochester Falls may not rank as the most breathtaking waterfalls in the country, they are undeniably worth exploring if you find yourself nearby. Simply follow the makeshift signs guiding you from the main road through Souillac. The route, while a bit intricate, is reliable, albeit a tad rough along the stony track. Be prepared for local vendors who might expect a tip for assisting you in finding a parking spot. Following a brief five-minute walk from your vehicle, you'll arrive at the cascading waterfall emerging from the cane fields.\n" +
                            "Situated in the southern part of the island, within the Souillac district, Rochester Falls exemplifies the distinctive volcanic formations and the historical background of Mauritius as a volcanic island. What sets this waterfall apart is its unique appearance, with water flowing through rock formations that resemble square blocks, creating a captivating illusion unlike any other waterfall on the island.\n" +
                            "Popular among both locals and visitors, the falls offer a serene pond for swimming, tucked away in a lush, untamed forest, providing a peaceful escape from the hustle and bustle of civilization. This secluded setting makes it an ideal location for a day out with friends, emphasizing the appeal of nature's untouched beauty. \n";

                    model.title1 = "A few tips";
                    model.image1 = R.drawable.map_location;
                    model.text2 = "1.\tNot recommended to visit during or after heavy rainfall.\n" +
                            "2.\tExercise caution if engaging in cliff jumping, as surfaces may be slippery.\n";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 2) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bel_ombre_1;
                    model.text1 = "Bel Ombre is more than just a beautiful beach destination; it's a haven of untouched nature, where the air is filled with the melody of chirping birds and the surroundings boast lush greenery, majestic mountain views, and hidden waterfalls. The Bel Ombre Nature Reserve, protected by the Mauritian Wildlife Foundation, resembles a magical Garden of Eden, promoting sustainability and effective environmental management. The reserve, spanning 1,300 hectares in the Domaine de Bel Ombre, invites visitors to engage with nature through activities like quad biking, trekking, Segway tours, and 4x4 discovery tours.";
                    model.title1 = "";
                    model.image1 = R.drawable.bel_ombre_11;
                    model.text2 = "Nestled between the Indian Ocean's blue expanse and the emerald green endemic forests of the South, the Bel Ombre Nature Reserve is a treasure trove of Mauritian biodiversity. The mountainous landscape offers breathtaking views, plains where stags gracefully roam, impressive waterfalls, and unspoiled natural beauty. Various activities, including quad biking, 4x4 discovery tours, trekking, kids' tours, and Segway rides, provide opportunities to explore this enchanting reserve.\n";
                    model.title2 = "";
                    model.text3 = "Highlights of the activities include:\n" +
                            "1.\t4x4 Excursion – A journey through the diverse flora and fauna, with a stop at the picturesque l'Example waterfall.\n";
                    model.image2 = R.drawable.bel_ombre_6;
                    model.text4 = "2.\tQuad & Buggy – An adventurous exploration of the reserve's natural wonders, including a refreshing stop at a waterfall for a swim.";
                    model.title3 = "";
                    model.text5 = "3.\tKids Discovery Tour – Specially designed for young adventurers, featuring a drive through sugarcane fields and a freshwater fishing trip.\n" +
                            "4.\tTrekking Exploration – A nature walk starting at the Old Chimney, leading through the river reserve to a waterfall with a natural rock pool for a refreshing dip.\n";
                    model.title4 = "";
                    model.text6 = "";
                    model.title5 = "";
                    model.text7 = "";
                    model.title6 = "";
                    model.text8 = "";
                    model.title7 = "";
                    model.image3 = R.drawable.bel_ombre_12;
                    model.text9 = "5.\tSegway Ride – An easy exploration of the Domaine's magnificent scenery during a 45-minute ride, covering key landmarks.\n" +
                            "The Segway ride's itinerary includes the welcome center of Frederica, Heritage Golf Club, C Beach Club, Heritage Le Telfair Golf and Spa Resort, Place du Moulin, Le Château de Bel Ombre, and back to the welcome center.\n";
                    model.title8 = "";
                    model.text10 = "";
                    model.image4 = R.drawable.map_location;
                    model.text11 = "";
                    model.image5 = R.drawable.map_location;
                    model.text12 = "";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 3) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.valle_des_couleurs;
                    model.text1 = "The southern region of Mauritius is adorned by the 450-acre natural reserve known as La Vallée Des Couleurs. It is a picturesque haven, allowing visitors to escape the worries of the world and immerse themselves in the refreshing air amidst extraordinary views of nature. Located in Mare Anguilles, Chamouny, the reserve is open every day from 9 am to 5:30 pm.\n" +
                            "La Vallée des Couleurs offers a myriad of exciting activities, creating a memorable experience for all. Explore the charming animal farm, savor delicious cuisines while surrounded by grazing deer and a waterfall, and partake in activities such as trekking, luge karting, Nepalese bridge rides, quad bike tours, ziplining, and witness the mesmerizing 23-colored earth.\n";
                    model.title1 = "";
                    model.image1 = R.drawable.valle_des_couleurs_2;
                    model.text2 = "The park offers panoramic views of the sea amid lovely greenery. Notable activities and attractions include trekking, mountain luge karting, Nepalese bridge walks, ziplining, quad biking, and visits to the animal farm and restaurants.\n" +
                            "La Vallée des Couleurs is designed for both adventure seekers and those seeking tranquility. Major attractions are within a 15-minute walk, and additional options include buggy or quad bike rides for a quick park exploration. The highlight is the 23-colored earth visible during the quad bike ride.\n";
                    model.title2 = "";
                    model.text3 = "";
                    model.image2 = R.drawable.valle_des_couleurs_17;
                    model.text4 = "The park engages all senses, from the visual delight of the iconic 23-colored land to the sounds of birds and waterfalls, the fragrance of wet tree trunks, the taste of delicious cuisine, and the unique experience of ziplining. Trekking through the park provides a two-hour journey with thrilling activities and breathtaking views, culminating at a waterfall.";
                    model.title3 = "";
                    model.text5 = "";
                    model.title4 = "";
                    model.text6 = "";
                    model.title5 = "";
                    model.text7 = "";
                    model.title6 = "";
                    model.text8 = "";
                    model.title7 = "";
                    model.image3 = R.drawable.valle_des_couleurs_5;
                    model.text9 = "Mountain luge karting offers a thrilling experience on a 700m track, while the Nepalese Bridge, a 350m footbridge, provides an adrenaline rush with panoramic views. Ziplining features seven lines, including the longest one stretching over 1.5 km, offering a bird's-eye view of the park.";
                    model.title8 = "";
                    model.text10 = "";
                    model.image4 = R.drawable.valle_des_couleurs_12;
                    model.text11 = "\n" +
                            "Quad biking and buggy rides delve into the tropical forest, interacting with wildlife and reaching the 23-colored land, rich in minerals from volcanic eruptions. The park also houses an animal farm with tortoises, chickens, and deer.\n";
                    model.image5 = R.drawable.vallee_des_couleurs_1;
                    model.text12 = "Various eateries serve delectable cuisine around the waterfalls, including an Indian restaurant providing Subcontinent and French cuisines. La Vallée des Couleurs ensures a captivating experience for visitors of all ages, combining adventure, wildlife, and natural beauty.";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 4) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.blue_bay;
                    model.text1 = "Located in the southeast of the island, Blue Bay was designated a national park in 1997 and later recognized as a wetland site under the Ramsar Convention on Wetlands of International Importance in 2008. The marine park is renowned for its coral garden, housing a diverse array of corals and abundant fauna. Close to the coastline, it offers ideal conditions for snorkeling, boasting rich biodiversity and calm, shallow seawater.";
                    model.title1 = "";
                    model.image1 = R.drawable.blue_bay_4;
                    model.text2 = "Upon setting foot on Blue Bay beach, you will bump intohawkers selling artisanal jewelry and canvassers promoting glass-bottom boat trips or snorkeling outings. Over fifteen operators are permitted to engage in commercial activities within the Blue Bay Marine Park.";
                    model.title2 = "";
                    model.text3 = "";
                    model.image2 = R.drawable.blue_bay_2;
                    model.text4 = "\n" +
                            "The main attraction in the Marine Park is a more than 1,000-year-old brain coral with a 5-meter diameter, making it the region's primary tourist attraction. The coral garden near Mahebourg, a small coastal village in the south-east, boasts a remarkable surface area and biodiversity. Visitors often come to witness the ancient brain coral, and various activities, such as glass-bottom boat trips, offer different perspectives of the vibrant marine life.\n" +
                            "Most operators in Blue Bay Marine Park are descendants of local fishermen turned to tourism. Glass-bottom boat trips are accessible to all, providing a serene experience to explore the beauty of the park. Those seeking a closer encounter can embark on a boat and snorkel, enjoying the vibrant underwater life in warm and clear waters.\n" +
                            "The Marine Park covers 353 hectares and is a popular leisure area for tourists and locals, sustaining numerous households through various activities. Measures have been implemented to balance economic activity with sustainable development, including the installation of permanent mooring buoys to demarcate conservation areas and regulated zones for fishing, boat traffic, swimming, and waterskiing. These measures aim to protect the marine fauna and flora, preserve biodiversity, promote scientific research, and educate the public.\n";
                    model.title3 = "";
                    model.text5 = "";
                    model.title4 = "";
                    model.text6 = "";
                    model.title5 = "";
                    model.text7 = "";
                    model.title6 = "";
                    model.text8 = "";
                    model.title7 = "";
                    model.image3 = R.drawable.blue_bay_6;
                    model.text9 = "Coast guards patrol the area daily to enforce regulations, ensuring compliance from skippers, swimmers, and fishermen. ";
                    model.title8 = "Protected Marine Area, Key Features";
                    model.text10 = "•\t<b>Exceptional Marine Biodiversity:</b> Blue Bay Marine Park features various ecosystems, including coral reefs, meadows of phanerogamous plants, mangroves, macro-algae, and inner lagoon flat stations. It houses over 38 coral species, 72 fish species, 31 algae species, 2 mangrove species, and 4 species of phanerogamous plants.";
                    model.image4 = R.drawable.blue_bay_3;
                    model.text11 = "•\t<b>Unique Classification in Mauritius:</b> Designated a Marine Park under the Wildlife and National Parks Act 1993, a protected zone in 2000 under the Fisheries and Marine Act 1998 and recognized as a Ramsar Convention site in 2008. Mooring buoys are strategically placed to minimize damage to corals by boat anchors";
                    model.image5 = R.drawable.blue_bay_8;
                    model.text12 = "•\t<b>Outdoor Activities Available to All:</b> Glass-bottom boat trips and snorkeling are popular activities, allowing non-swimmers to explore the marine environment through the glass bottom. Snorkeling conditions are ideal, and Coco Island, visible from the beach, serves as a relaxing spot for snorkelers under casuarina trees. Operators provide drop-off and pick-up services.";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 5) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.mahebourg;
                    model.text1 = "Nestled in the heart of the traditional Mauritian Village, the newly developed Mahebourg Waterfront offers an idyllic setting for a leisurely stroll and a captivating journey into local Mauritian history. Take the opportunity to explore the naval museum and delve into the details of the epic battle that unfolded in this region. The Bataille de le Passe memorial stands as a poignant tribute to the brave fighters who sacrificed their lives in that historic battle.";
                    model.title1 = "";
                    model.image1 = R.drawable.mahebourg_5;
                    model.text2 = "Conveniently situated behind the bus station, the iconic Sir Gaetan Duval Esplanade is a prominent feature of the Mahebourg Waterfront. This locale is perfect for enthusiasts of seaside walks, offering an enchanting experience amidst the beauty of nature and breathtaking sea views.";
                    model.title2 = "";
                    model.text3 = "";
                    model.image2 = R.drawable.mahebourg_waterfront_1;
                    model.text4 = "Immerse yourself in the rich history of the Grand Port battle, a pivotal event that has left an indelible mark on our heritage. Don't overlook the captivating sight of the 'Mouchoir Rouge' island at the quay's end – a truly mesmerizing view.";
                    model.title3 = "";
                    model.text5 = "";
                    model.title4 = "";
                    model.text6 = "";
                    model.title5 = "";
                    model.text7 = "";
                    model.title6 = "";
                    model.text8 = "";
                    model.title7 = "";
                    model.image3 = R.drawable.mahebourg_3;
                    model.text9 = "Facing the Mahebourg Waterfront is the bustling local market of Mahebourg, a vibrant hub filled with delectable street food, local treats, and fresh vegetables. Take a detour to indulge in some essential shopping. While the Mahebourg Waterfront is a popular weekend destination for locals, attracting picnickers and those seeking casual relaxation, we recommend visiting during the week to avoid the crowds.";
                    model.title8 = "";
                    model.text10 = "";
                    model.image4 = R.drawable.map_location;
                    model.text11 = "";
                    model.image5 = R.drawable.map_location;
                    model.text12 = "";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 6) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.mahebourg_museum_2;
                    model.text1 = "Nestled in the enchanting Southeast of Mauritius, the National History Museum in Mahebourg is a captivating attraction. Imagine encountering the rare and nearly complete skeleton of the dodo, along with naval artifacts and posters vividly illustrating life during colonial times. Housed in a vintage 'old world' mansion, this museum is not only charming but is also designated as a National Heritage Site.\n" +
                            "Known as Gheude Castle, this charming residence was constructed at the close of the 18th century and originally belonged to the de Robillard family. Mr. Jean de Robillard, the district commander of Grand Port, was its first owner. Over the years, the house was inhabited by various significant French settlers before being acquired by the Mauritius government in 1947. The transformation of this colonial mansion into a Naval and Historical Museum culminated in the inauguration of the Dutch Section by the descendant of Maurits Van Nassau, after whom Mauritius was named in 1598.\n";
                    model.title1 = "";
                    model.image1 = R.drawable.mahebourg_museum_5;
                    model.text2 = "Within the 12-acre garden surrounding the museum, visitors are treated to a reproduction of quaint village houses. The museum's collection includes salvaged items from naval battles, a rare dodo skeleton, maps, old coins, and furniture. Explore the weaponry used by the corsair Robert Surcouf and marvel at the bell retrieved from the wreck of the Saint Geran, which sank off the East coast in the 18th century.";
                    model.title2 = "";
                    model.text3 = "";
                    model.image2 = R.drawable.mahebourg_6;
                    model.text4 = "The cannon displayed in front of the museum originates from the British frigate named La Magicienne and faces the entrance from the main road leading to the village of Mahebourg. As you ascend to the first floor, discover a four-poster bed that once belonged to Mahe de Labourdonnais, the first French governor of Mauritius. The museum also showcases palanquins carried by slaves, highlighting a regal era.";
                    model.title3 = "";
                    model.text5 = "";
                    model.title4 = "";
                    model.text6 = "";
                    model.title5 = "";
                    model.text7 = "";
                    model.title6 = "";
                    model.text8 = "";
                    model.title7 = "";
                    model.image3 = R.drawable.mahebourg_museum_4;
                    model.text9 = "A remarkable historical note reveals that during a naval battle in August 1810 at nearby Vieux Grand Port, both the British and French commanders, Sir Nesbit Willoughby and Baron Victor Duperre, were injured and cared for in the same wing of the maritime museum. This battle is notably the only naval victory for the French, commemorated at the Arc de Triomphe in Paris.\n" +
                            "Located off the main road, a mere 10-minute drive from the airport, the Mahebourg Naval Museum can be visited from Monday to Saturday, 09:00 to 16:00, and on Sundays from 09:00 to 12:00. Admission is free, making it a must-visit destination in the Southeast. Please note that interior photography is prohibited, ensuring an immersive experience during your visit to this delightful museum.\n";
                    model.title8 = "";
                    model.text10 = "";
                    model.image4 = R.drawable.map_location;
                    model.text11 = "";
                    model.image5 = R.drawable.map_location;
                    model.text12 = "";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 7) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.ile_aux_aigrettes_1;
                    model.text1 = "Located off the southeastern coast of Mauritius, Ile aux Aigrettes serves as both a nature reserve and a scientific research station, drawing visitors that include both tourists and Mauritians.\n" +
                            "Geographically, it spans 27 hectares (67 acres) and is the largest islet in the Grand Port bay, situated 850 meters (2,790 ft) from the southeast coast of Mauritius and approximately a kilometer (0.62 mi) from the coastal town of Mahebourg. Characterized by its low-lying terrain, the islet is composed of coral-limestone, in contrast to the volcanic rock predominant in the majority of Mauritius.\n" +
                            "\n";
                    model.title1 = "";
//                    TODO
//                    model.image1 = R.drawable.ile_aux_aigrettes_4;
                    model.image1 = R.drawable.ile_aux_aigrettes_1;
                    model.text2 = "Functioning as a nature reserve and conservation area, Ile aux Aigrettes safeguards the world's sole remaining fragment of the \"Mauritius Dry Coastal Forest,\" once a flourishing vegetation type. Consequently, it hosts a significant population of highly rare or endangered plant and animal species.";
                    model.title2 = "";
                    model.text3 = "";
                    model.image2 = R.drawable.pink_pigeon;
                    model.text4 = "Historically, extensive logging and invasive species decimated indigenous flora and fauna over several centuries, mirroring the plight of the rest of Mauritius. The extinction of the Dodo and the native giant tortoise, along with numerous plant species, was a shared fate. Despite these challenges, remnants of certain species endured. In 1965, the islet earned designation as a nature reserve, prompting dedicated efforts to restore vegetation and preserve the remaining indigenous animal species. Furthermore, various species, previously absent from the island but surviving elsewhere in Mauritius, were reintroduced.";
                    model.title3 = "";
                    model.text5 = "";
                    model.title4 = "";
                    model.text6 = "";
                    model.title5 = "";
                    model.text7 = "";
                    model.title6 = "";
                    model.text8 = "";
                    model.title7 = "";
                    //                    TODO

//                    model.image3 = R.drawable.ile_aux_aigrettes_3;
                    model.image3 = R.drawable.ile_aux_aigrettes_1;
                    model.text9 = "\n" +
                            "Reptile species on the islet include the Telfairs Skink, a large and slow-moving reptile, various ornately colored day geckos, and a population of non-indigenous Aldabra giant tortoises. Introduced to Île aux Aigrettes, these giant tortoises play a vital ecological role, replicating the function of the extinct Mauritian tortoises by consuming and dispersing plant seeds, facilitating natural forest rejuvenation.\n";
                    model.title8 = "";
                    model.text10 = "";
                    model.image4 = R.drawable.map_location;
                    model.text11 = "The rare and endemic ebony tree species, Diospyros egrettarum, derives its name from this island, where it thrives abundantly.";
                    model.image5 = R.drawable.map_location;
                    model.text12 = "";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                }


            } else if ((name.equals("East"))) {
                if (getAdapterPosition() == 0) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.ferney_1;
                    model.text1 = "Located in the Bambou mountains north of Mahébourg in Grand Port District, La Vallée de Ferney, is a forest and wildlife reserve managed by the La Vallée de Ferney Conservation Trust. Established in 2006, the 200-hectare natural area serves as a conservation trust in collaboration with the Mauritian Wildlife Foundation (MWF) and local authorities, focusing on the restoration of indigenous forests.";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 1) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bagatelle_mall_1;
                    model.text1 = "";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 2) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bagatelle_mall_1;
                    model.text1 = "";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 3) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bagatelle_mall_1;
                    model.text1 = "";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 4) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bagatelle_mall_1;
                    model.text1 = "";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 5) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bagatelle_mall_1;
                    model.text1 = "";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 6) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bagatelle_mall_1;
                    model.text1 = "";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 7) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bagatelle_mall_1;
                    model.text1 = "";
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
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                }


            }
        }
    }
}
