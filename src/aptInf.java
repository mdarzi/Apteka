public class aptInf {
    public class aptinf {
        private String nameApt;
        private List<AptLek> lekarstva;

        private aptinf(String nameApt){
            this.nameApt = nameApt;
            this.lekarstva = new ArrayList<>();
        }

        public void addLek(AptLek lekarstvo) {
            lekarstva.add(lekarstvo);
        }
        public String GiveInfo() {
            StringBuilder info = new StringBuilder("Аптека: " + nameApt + "\nЛекарства: \n");
            for (AptLek lek : lekarstva) {
                info.append(lek.GiveInfo());
            }
        }
    }
}
