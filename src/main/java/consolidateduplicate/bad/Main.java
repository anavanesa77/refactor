package consolidateduplicate.bad;


public class Main {


        private double extraSalary;
        private int education;
        private int seniority;
        private int incidents;
        private boolean certification;

        double calculateExtraSalary(){
            double result = 0;

            if(!isElegibleExtraSalary()){
                result = 500;
                sendMessage();
            }else{
                result = 0;
                sendMessage();
            }

            return result;
        }

    private void sendMessage() {
        System.out.println("Sending message");
    }

    public boolean isElegibleExtraSalary() {
            boolean estudios = seniority < 1 || education < 1;
            boolean antiguedad = incidents > 10 && certification;
            return estudios || antiguedad;
        }

    }