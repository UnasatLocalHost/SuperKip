package sr.unasat.superkip.app;

import java.time.LocalDate;


public class Application {

    static class VerpakteKip {
        private int LabelNumber;
        private double Weight;
        private LocalDate expirationDate;

        public VerpakteKip(int labelNum, double wght, LocalDate expirationD) {
            LabelNumber = labelNum;
            Weight = wght;
            expirationDate = expirationD;
        }

        public String toString() {
            return "LabelNumber" + LabelNumber + "ExpirationDate" + expirationDate + "Weight" + Weight;
        }

        public int getLabelNumber() {
            return LabelNumber;
        }

        public void setLabelNumber(int labelNumber) {
            LabelNumber = labelNumber;
        }

        public double getWeight() {
            return Weight;
        }

        public void setWeight(double weight) {
            Weight = weight;
        }

        public LocalDate getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(LocalDate expirationDate) {
            this.expirationDate = expirationDate;
        }

        public int getLastLabelNumber() {
            return LabelNumber;
        }
    }

    public static class MainApplication {

        public static void main(String[] args) {
            VerpakteKip[] verpakteKippen = new VerpakteKip[]{
                    new VerpakteKip(1001, 5, 2020 - 07 - 11),
                    new VerpakteKip(1002, 5, 2020 - 07 - 12),
                    new VerpakteKip(1003, 5, 2020 - 07 - 22),
                    new VerpakteKip(1016, 5, 2020 - 07 - 22),
                    new VerpakteKip(1005, 5, 2020 - 07 - 22),
                    new VerpakteKip(1004, 5, 2020 - 07 - 22),
                    new VerpakteKip(1007, 5, 2020 - 07 - 22),
                    new VerpakteKip(1008, 5, 2020 - 07 - 22),
                    new VerpakteKip(1009, 5, 2020 - 07 - 22),
                    new VerpakteKip(1010, 5, 2020 - 07 - 22),
                    new VerpakteKip(1011, 5, 2020 - 07 - 22),
                    new VerpakteKip(1012, 5, 2020 - 07 - 22),
                    new VerpakteKip(1013, 5, 2020 - 07 - 22),
                    new VerpakteKip(1014, 5, 2020 - 07 - 22),
                    new VerpakteKip(1015, 5, 2020 - 07 - 22)


            };

            System.out.println("Before Sorting ");

            for (VerpakteKip vp : verpakteKippen) {
                System.out.println(vp);
            }

            insertionSort(verpakteKippen);

            System.out.println("After Sorting");
            for (VerpakteKip vp : verpakteKippen) {
                System.out.println(vp);
            }

        }



        public static void insertionSort(VerpakteKip[] verpakteKippen) {
            int in, out;

            for (out = 1; out < verpakteKippen.length; out++) {
                VerpakteKip temp = verpakteKippen[out];
                in = out;
                while (in > 0 && verpakteKippen[in - 1].getLastLabelNumber().compareTo(temp.getLastLabelNumber()) > 0) {
                    verpakteKippen[in] = verpakteKippen[in - 1];

                    in--;
                }


                verpakteKippen[in] = temp;
            }


        }
    }


}