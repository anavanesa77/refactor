package consolidateconditional.bad;


public class consolidateCondicional {

        private double extraSalary;
        private int education;
        private int seniority;
        private int incidents;
        private boolean certification;

        double calculateExtraSalary(){
                double result = 0;
                if (seniority < 1){
                        return 0;
                }
                if (education < 1){
                        return 0;
                }
                if (incidents > 10){
                        return 0;
                }
                if (!certification){
                        return 0;
                }
                return result;
        }

}