    package behavior.Observer;

    public class Test {
        public static void main(String[] args) {
            Transporter transporter = new Transporter();

            Police police = new Police();
            Security security = new Security();
            Thief thief = new Thief();

            transporter.addWatcher(police);
            transporter.addWatcher(security);
            transporter.addWatcher(thief);

            transporter.notifyWatcher();

        }
    }
