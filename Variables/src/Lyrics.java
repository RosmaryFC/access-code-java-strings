import javax.print.attribute.standard.Severity;

/**
 * Created by c4q-rosmary on 3/3/15.
 */
public class Lyrics {
    public static void main( String[] args ){

        String Repeat1 = ("On the ");
        String Repeat2 = (" day of christmas my true love gave to me");
        String FirstDay = (" a Partridge in a pear tree");
        String SecondDay = (" Two Turtle doves" + "\n and" + FirstDay );
        String ThirdDay = (" Three French hens" +"\n" + SecondDay );
        String FourthDay = (" Four Colly birds" + "\n" + ThirdDay );
        String FifthDay = (" Five Golden rings" + "\n" + FourthDay );
        String SixthDay = (" Six Geese a laying" + "\n" + FifthDay );
        String SeventhDay = (" Seven Swans a swimming" + "\n" + SixthDay );
        String EighthDay = (" Eight Maids a milking" + "\n" + SeventhDay );
        String NinthDay = (" Nine Drummers drumming" + "\n" + EighthDay );
        String TenthDay = (" Ten Pipers piping" + "\n" + NinthDay );
        String EleventhDay = (" Eleven Ladies dancing" + "\n" + TenthDay );
        String TwelfthDay = (" Twelve Lords a leaping" + "\n" + EleventhDay );


        System.out.println( Repeat1 + "First" + Repeat2);
        System.out.println( FirstDay );
        System.out.println("");

        System.out.println( Repeat1 + "Second" + Repeat2);
        System.out.println( SecondDay );
        System.out.println("");

        System.out.println( Repeat1 + "third" + Repeat2);
        System.out.println( ThirdDay );
        System.out.println("");

        System.out.println( Repeat1 + "fourth" + Repeat2);
        System.out.println( FourthDay );
        System.out.println("");

        System.out.println( Repeat1 + "fifth" + Repeat2);
        System.out.println( FifthDay );
        System.out.println("");

        System.out.println( Repeat1 + "sixth" + Repeat2);
        System.out.println( SixthDay );
        System.out.println("");

        System.out.println( Repeat1 + "seventh" + Repeat2);
        System.out.println( SeventhDay );
        System.out.println("");

        System.out.println( Repeat1 + "eighth" + Repeat2);
        System.out.println( EighthDay );
        System.out.println("");

        System.out.println( Repeat1 + "ninth" + Repeat2);
        System.out.println( NinthDay );
        System.out.println("");

        System.out.println( Repeat1 + "tenth" + Repeat2);
        System.out.println( TenthDay );
        System.out.println("");

        System.out.println( Repeat1 + "eleventh" + Repeat2);
        System.out.println( EleventhDay );
        System.out.println("");

        System.out.println( Repeat1 + "twelfth" + Repeat2);
        System.out.println( TwelfthDay );
        System.out.println("");

    }
}
