package chap2;

public class Switch

    {

        public static void main(String[] args) {

            int dayOfWeek = 5;
            switch (dayOfWeek) {
                default:
                    System.out.println("Weekday1");
                    break;
                case 0:
                    System.out.println("Sunday1");
                    break;
                case 6:
                    System.out.println("Saturday1");
                    break;
            }

            // we mut put default end of switch
            switch (dayOfWeek) {
                case 0:
                    System.out.println("Sunday2");
                    break;
                default:
                    System.out.println("Weekday2");
                case 6:
                    System.out.println("Saturday2");
                    break;
            }
        }

    }
