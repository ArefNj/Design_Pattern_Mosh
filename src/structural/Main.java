package structural;

import structural.decorator.CloudStream;
import structural.decorator.CompressCloudStream;
import structural.decorator.EncryptedCloudStream;

public class Main {
    public static void main(String[] args) {
        /* composite patten : shapes & groups */
//        var group1 = new Group();
//        group1.addObject(new Shape("square 1")); // square
//        group1.addObject(new Shape("square 2")); // square
//
//        var group2 = new Group();
//        group2.addObject(new Shape("circle 3")); // circle
//        group2.addObject(new Shape("circle 4")); // circle
//
//        var group = new Group();
//        group.addObject(group1);
//        group.addObject(group2);
//
//        group.render();
//        group1.move();
//        group2.render();

        /* composite patten Example : team War */
//        Demo.show();

        /* Adapter pattern : imageView  -> Caramel */
//        var imageView = new ImageView(new Image());
//        imageView.apply(new VividFilter());
//         // composition implementation
//        imageView.apply(new CaramelFilter(new Caramel()));
//         // inheritance implementation
//        imageView.apply(new OxygenFilter());
/*
         composition > inheritance
         -> because we don't have multiple inheritance in Java, so composition is more flextable
*/

        /* Adapter pattern Example : emailClient */
//        EmailClient emailClient = new EmailClient();
//        emailClient.addProvider(new GmailAdapter(new GmailClient()));
//        emailClient.downloadEmails();

    /* decorator pattern :  */
        var encryptedCloudStream = new EncryptedCloudStream(new CloudStream());
        encryptedCloudStream.write("some data");
        var compressedCloudStream = new CompressCloudStream(new CloudStream());
        compressedCloudStream.write("some data");
        var encryptedAndCompressedCloudStream = new EncryptedCloudStream(new CompressCloudStream(new CloudStream()));
        encryptedAndCompressedCloudStream.write("some data");



    }


}
