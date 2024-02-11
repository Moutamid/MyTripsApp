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
                    model.title1 = " ";
                    model.image1 = R.drawable.map_location;
                    model.text2 = " ";
                    model.title2 = " ";
                    model.text3 = " ";
                    model.image2 = R.drawable.map_location;
                    model.text4 = " ";
                    model.title3 = " ";
                    model.text5 = " ";
                    model.title4 = " ";
                    model.text6 = " ";
                    model.title5 = " ";
                    model.text7 = " ";
                    model.title6 = " ";
                    model.text8 = " ";
                    model.title7 = " ";
                    model.image3 = R.drawable.map_location;
                    model.text9 = " ";
                    model.title8 = " ";
                    model.text10 = " ";
                    model.image4 = R.drawable.map_location;
                    model.text11 = " ";
                    model.image5 = R.drawable.map_location;
                    model.text12 = " ";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 1) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.bois_cheri_1;
                    model.text1 = "The Bois Cheri Plantation was established in 1892 and since then has become the largest tea producer in the country. Covering more than 250 hectares, it includes a museum and a factory where visitors can learn all about the art and science of tea.<br>" +
                            "When you visit the tea estate, you can join guided tours to explore the factory, see the museum and plantation, and even try some tea tasting. Your guide will share the history and stories of Bois Chéri and explain how important tea production is for Mauritius.<br>";
                    model.title1 = " ";
                    model.image1 = R.drawable.bois_cheri_8;
                    model.text2 = "If you enjoy tea and nature, this tour is a must. The plantation is close to the museum and the main factory, surrounded by lush greenery. The peaceful setting provides a perfect backdrop for relaxation.";
                    model.title2 = " ";
                    model.text3 = " ";
                    model.image2 = R.drawable.bois_cheri_6;
                    model.text4 = "Aside from the beautiful tea plantation, you'll enjoy picturesque views of the South coast on one side and a stunning crater lake on the other. Driving around is delightful, with spots to stop and capture photos of the lake, unique trees, and tea plantations from different angles.";
                    model.title3 = "The factory and Museum";
                    model.text5 = "The museum provides lots of information about Mauritian tea history, showcasing old machines used in tea production, including an old locomotive train. The factory tour allows you to see the tea-making process in action. Bois Cheri produces both green and black tea, with their signature being vanilla tea.";
                    model.title4 = " ";
                    model.text6 = " ";
                    model.title5 = " ";
                    model.text7 = " ";
                    model.title6 = " ";
                    model.text8 = " ";
                    model.title7 = " ";
                    model.image3 = R.drawable.bois_cheri_7;
                    model.text9 = "After your museum and factory adventure, it's time for tea tasting. Head to the factory café near the restaurant to try various teas. You can also purchase waffles or pancakes to enjoy with your tea.<br>" +
                            "The Bois Cheri restaurant is within walking distance and offers breathtaking views of the south coast. The restaurant serves unique cuisines, including local flavors. You'll have the chance to taste dishes like shrimps with green tea and chicken with exotic tea. Whether you visit with friends or family, the restaurant and the entire tour offer a delightful experience with delicious food, scenic views, and soothing music.<br>";
                    model.title8 = " ";
                    model.text10 = " ";
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
                    model.text12 = " ";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 2) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.eureka_house;
                    model.text1 = "If you're looking to explore an attraction that encapsulates Mauritius' rich colonial history, Eureka is the top choice. This meticulously preserved Creole mansion, constructed in the 1830s, now serves as a museum, offering a captivating journey back in time and unveiling the vibrant plantation history of the island. The main manor house stands as a tropical architectural marvel, renowned for maintaining a refreshingly cool interior during the scorching summers. With an impressive count of 109 doors and more rooms than a Cluedo board, it truly showcases exceptional craftsmanship.";
                    model.title1 = " ";
                    model.image1 = R.drawable.eureka_house_3;
                    model.text2 = "Inside, rooms are adorned with a flawlessly conserved collection of period furniture imported by the French East India Company. Noteworthy items include antique maps, a peculiar shower contraption that was considered a luxury 150 years ago, and a weathered piano with keys resembling decaying teeth.";
                    model.title2 = " ";
                    model.text3 = " ";
                    model.image2 = R.drawable.eureka_house_2;
                    model.text4 = "Venturing into the courtyard behind the main mansion reveals beautifully landscaped grounds encompassed by a series of stone cottages, formerly serving as servants' quarters and a kitchen. Following the trail at the back for 15 minutes leads to the picturesque Ravin waterfall.<br>" +
                            "The estate earned its distinctive name when Eugène Le Clézio successfully secured the house through auction in 1856.<br>";
                    model.title3 = " ";
                    model.text5 = " ";
                    model.title4 = " ";
                    model.text6 = " ";
                    model.title5 = " ";
                    model.text7 = " ";
                    model.title6 = " ";
                    model.text8 = " ";
                    model.title7 = " ";
                    model.image3 = R.drawable.map_location;
                    model.text9 = " ";
                    model.title8 = " ";
                    model.text10 = " ";
                    model.image4 = R.drawable.map_location;
                    model.text11 = " ";
                    model.image5 = R.drawable.map_location;
                    model.text12 = " ";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 3) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.grand_bassin_1;
                    model.text1 = "Grand Bassin, also known as Ganga Talao, is located in the Savanne quiet mountain area. It's a crater lake about 550 meters above sea level. The first group of people to visit Ganga Talao was from the village of Triolet, led by Pandit Giri Gossayne in 1898. This place is sacred to Hindus in Mauritius.<br>" +
                            "The Shiv Mandir is on the lake's bank and is dedicated to Shiva. During Shivaratri, around half a million Hindus in Mauritius go on a pilgrimage to the lake, with many walking barefoot from their homes carrying Kanvars.<br>";
                    model.title1 = " ";
                    model.image1 = R.drawable.grand_bassin_2;
                    model.text2 = "The name Ganga Talao means \"Lake of Ganga,\" connecting it symbolically to the Indian river Ganga (Ganges).<br>" +
                            "<b>History</b><br>" +
                            "In 1866, Pandit Sanjibonlal returned to Mauritius from India after his first contract and turned Grand Bassin into a pilgrimage place. He converted a building into a temple and brought a Shivalingam from India. <br>" +
                            "In 1897, Jhummon Giri Gosagne Napal, a priest, had a dream about the water of Grand Bassin being part of Ganga. The lake was then known as \"Pari Talao,\" and in 1998, it was declared a \"sacred lake.\" In 1972, Ganga water from the Ganges River was mixed with the lake water, and it was renamed Ganga Talao.<br>" +
                            "<b>Events</b><br>" +
                            "During Maha Shivaratri, devotees start a journey on foot to Grand Bassin, and volunteers offer food and drinks to the pilgrims. The lake hosts a 33-meter-tall statue of Shiva called Mangal Mahadev, inaugurated in 2007. Durga Pooja and Navaratri are celebrated grandly near the statue, and Shiva Ratri is a national holiday celebrated auspiciously by Hindus in Mauritius.<br>";
                    model.title2 = " ";
                    model.text3 = " ";
                    model.image2 = R.drawable.map_location;
                    model.text4 = " ";
                    model.title3 = " ";
                    model.text5 = " ";
                    model.title4 = " ";
                    model.text6 = " ";
                    model.title5 = " ";
                    model.text7 = " ";
                    model.title6 = " ";
                    model.text8 = " ";
                    model.title7 = " ";
                    model.image3 = R.drawable.map_location;
                    model.text9 = " ";
                    model.title8 = " ";
                    model.text10 = " ";
                    model.image4 = R.drawable.map_location;
                    model.text11 = " ";
                    model.image5 = R.drawable.map_location;
                    model.text12 = " ";
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
                    model.title1 = " ";
                    model.image1 = R.drawable.map_location;
                    model.text2 = " ";
                    model.title2 = " ";
                    model.text3 = " ";
                    model.image2 = R.drawable.map_location;
                    model.text4 = " ";
                    model.title3 = " ";
                    model.text5 = " ";
                    model.title4 = " ";
                    model.text6 = " ";
                    model.title5 = " ";
                    model.text7 = " ";
                    model.title6 = " ";
                    model.text8 = " ";
                    model.title7 = " ";
                    model.image3 = R.drawable.map_location;
                    model.text9 = " ";
                    model.title8 = " ";
                    model.text10 = " ";
                    model.image4 = R.drawable.map_location;
                    model.text11 = " ";
                    model.image5 = R.drawable.map_location;
                    model.text12 = " ";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 5) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.le_pouce_1;
                    model.text1 = "Le Pouce is the third highest mountain in Mauritius, soaring to an elevation of 812 meters (2664 feet). Only surpassed in height by Piton de la Petite Rivière Noire (828 m) and Pieter Both (820 m), this mountain derives its name from the distinctive, thumb-shaped apex that graces its summit. It is part of the Moka range which is a dome of basalt lava that is no longer experiencing volcanic activity.";
                    model.title1 = " ";
                    model.image1 = R.drawable.le_pouce_2;
                    model.text2 = "This mountain was formerly known as the Mountain of Immortals, a name derived from a plant that persists on its slopes to this very day. Le Pouce Mountain promises an exquisite panorama encompassing Le Morne, Coin de Mire, the capital city, and various other locales strewn across the island. As you climb towards its summit, the mountain unfolds a tapestry of flourishing flora, unveiling exotic specimens and a collection of rare, uniquely indigenous species.It’s worth noting thaton the 2nd of May 1836, Charles Darwin ascended this majestic mountain.";
                    model.title2 = "Trails";
                    model.text3 = " ";
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
                    model.title4 = " ";
                    model.text6 = " ";
                    model.title5 = " ";
                    model.text7 = " ";
                    model.title6 = " ";
                    model.text8 = " ";
                    model.title7 = " ";
                    model.image3 = R.drawable.map_location;
                    model.text9 = " ";
                    model.title8 = " ";
                    model.text10 = " ";
                    model.image4 = R.drawable.map_location;
                    model.text11 = " ";
                    model.image5 = R.drawable.map_location;
                    model.text12 = " ";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 6) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.pieter_both_1;
                    model.text1 = "The Pieter Both is one among the most well-known and iconic locations in Mauritius. Postcards from Mauritius frequently include images of its spectacular beauty. Thousands of nature enthusiasts go to the Pieter Both Mountain for its breathtaking views and hiking adventures.An interesting fact is that the palm species Hyophorbe amaricaulis, once a ubiquitous sight on this mountain, is now the world's rarest palmas of 2023 due to a decline in propagation.<br>" +
                            "One of Mauritius' most recognizable mountains, the Pieter Both is visible from practically every south-west and central-northhighways.Itis the second highest mountain in Mauritius standing at 820 meters (2,690 feet). Shorter than Piton de la Petite Rivière Noire by eight meters, this mountain got its name from Pieter Both, the Governor-General of the Dutch East Indies. It is part of the Moka Range and distinguishes itself with a notable feature: a colossal rock formation crowning its summit, evoking the semblance of a human head.<br>";
                    model.title1 = " ";
                    model.image1 = R.drawable.pieter_both_2;
                    model.text2 = "Indeed, there is a well-known local mythology associated with this rock. There are rumors that a milkman from Crève Coeur, a village at the base of the mountain, used to sell milk in La Laura and the neighboring communities. He decided one day to go to the next village by using the Pieter Both route shortcut. Feeling tired from his trek, he took a short break to rest. Soon he felt asleep only to be awaked later by the sound of a lovely music.His eyes opened to the sight of mesmerizing fairies singing and dancing. When the fairies realized they were being watched by a mortal, theycursedthe milkman he would turn into a stone if he ever told anyone about what he had seen. Still mesmerized by what he saw and overwhelmed by his experience, he forgot his oath and revealed his encounter with the fairies tohis friends.When themilkman came to the same spotthe following day, the fairies already knew the milkman had not kept the secret. Furious, the fairies transformed him into stone. Severed from his body, the milkman’s head grew larger and transposed onto the summit of the mountain. According to the legend, the milkman's head turned into rock is the one atop the mountain.<br>" +
                            "Folklore aside, the Pieter Both is also well-known for its hiking trails. Hikers of all skill levels can tackle the mountain hike, which ranges from moderately tough to extremely challenging. It is advised that hikers, whether novice or expert, wear helmets, ropes, and harnesses. Guided hiking trips up the Pieter Both can also be arranged through these agencies.<br>" +
                            "The starting point of your climbing journey is in the La Laura village at the base of a mountain. It takes roughly one hour to climb the first 600–650 meters. The climb is moderately demanding and appropriate for hikers with average physical and health conditions. <br>";
                    model.title2 = " ";
                    model.text3 = " ";
                    model.image2 = R.drawable.pieter_both_3;
                    model.text4 = "If you're the daring type and want to try the unbatteredpath, carry on with the hike.  You will need goodrock-climbingtechniques to get to the mountain's neck. Although climbers still find assistance from the iron rungs set into the rock years ago by the Royal Navy and Special Mobile Force, it is safer to use ropes to climb your way up.<br>" +
                            "Want a more adventurous and challenging route up to the mountain's summit? No problem, there is something available for the brave ones as well. All you will need is some confidence and efforts on your part to climb the nine-meter-diameter boulder. Be aware that climbing the boulder is the hardest part due to the upward steepness.<br>" +
                            "If you choose to climb the mountain in the summer, bring with you water, a hat, sunglass, and sunscreen lotion. Exercise caution when hiking after a rainy day as the walkways become quite slippery.<br>" +
                            "The palm species Hyophorbe amaricaulis, once a ubiquitous sight on this mountain, is now the world's rarest palmas of 2023 due to a decline in propagation.<br>";
                    model.title3 = " ";
                    model.text5 = " ";
                    model.title4 = " ";
                    model.text6 = " ";
                    model.title5 = " ";
                    model.text7 = " ";
                    model.title6 = " ";
                    model.text8 = " ";
                    model.title7 = " ";
                    model.image3 = R.drawable.map_location;
                    model.text9 = " ";
                    model.title8 = " ";
                    model.text10 = " ";
                    model.image4 = R.drawable.map_location;
                    model.text11 = " ";
                    model.image5 = R.drawable.map_location;
                    model.text12 = " ";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                } else if (getAdapterPosition() == 7) {

                    BeacModel model = new BeacModel();
                    model.title = textView.getText().toString();
                    model.main_image = R.drawable.tamarin_falls_1;
                    model.text1 = "The Tamarind Falls is a picturesque waterfalllocated in the southwestern region of Mauritius. Nestled along the Rivière Tamarin river near the village of Henrietta, these falls boast seven successive tiers of cascades.";
                    model.title1 = " ";

                    model.image1 = R.drawable.tamarin_falls_2;
                    model.text2 = "<br>" +
                            "The main waterfall of the Tamarind Falls has an impressive height of 293 meters (961 feet), making it one of the highest waterfalls on the island. Thanks to the lush and diverse flora surrounding the waterfall, the area is one of the most picturesque and serene places in Mauritius. Nature and animal lovers will be delighted to discovermany exotic plants and birds populating the area.<br>" +
                            "Reaching the waterfalls can be a bit challenging though.Indeed, it takes nearly a full day of hiking to access this unspoiled natural marvel. The trail winds its way through the forest and includes a stretch across an open area on the basalt rockwhich is a clear sign you are in the vicinity of the Tamarind falls.<br>" +
                            "Once you reach the waterfall, you can take a well-deserved break and cool off in the basin. Alternatively, you can continue onward to climb to the top of the falls. As you climb up, you will come across a series of small pools and when you reach the top of the waterfall you will be rewarded bythespectacularpanorama of the lush green canyon unfolding in front of your eyes.<br>";
                    model.title2 = " ";
                    model.text3 = " ";
                    model.image2 = R.drawable.map_location;
                    model.text4 = " ";
                    model.title3 = " ";
                    model.text5 = " ";
                    model.title4 = " ";
                    model.text6 = " ";
                    model.title5 = " ";
                    model.text7 = " ";
                    model.title6 = " ";
                    model.text8 = " ";
                    model.title7 = " ";
                    model.image3 = R.drawable.map_location;
                    model.text9 = " ";
                    model.title8 = " ";
                    model.text10 = " ";
                    model.image4 = R.drawable.map_location;
                    model.text11 = " ";
                    model.image5 = R.drawable.map_location;
                    model.text12 = " ";
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
                    model.title1 = " ";
                    model.image1 = R.drawable.map_location;
                    model.text2 = " ";
                    model.title2 = " ";
                    model.text3 = " ";
                    model.image2 = R.drawable.map_location;
                    model.text4 = " ";
                    model.title3 = " ";
                    model.text5 = " ";
                    model.title4 = " ";
                    model.text6 = " ";
                    model.title5 = " ";
                    model.text7 = " ";
                    model.title6 = " ";
                    model.text8 = " ";
                    model.title7 = " ";
                    model.image3 = R.drawable.map_location;
                    model.text9 = " ";
                    model.title8 = " ";
                    model.text10 = " ";
                    model.image4 = R.drawable.map_location;
                    model.text11 = " ";
                    model.image5 = R.drawable.map_location;
                    model.text12 = " ";
                    Stash.put("model", model);
                    intent = new Intent(context, BeachDetails.class);
                    context.startActivity(intent);
                }
            }
        }
    }
}
