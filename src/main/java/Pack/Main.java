package Pack;
import org.kohsuke.args4j.CmdLineParser;

public class Main {
    public static void main(String[] args) throws Exception {
        PackRLE.rle();
        PackRLE.antiRle();
        PackRLE pack = new PackRLE();
        CmdLineParser parser = new CmdLineParser(pack);
        try {
            parser.parseArgument(args);
            pack.A();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}