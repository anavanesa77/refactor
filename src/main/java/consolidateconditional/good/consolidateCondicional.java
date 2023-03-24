package consolidateconditional.good;


    public class consolidateCondicional {

        private double extraSalary;
        private int education;
        private int seniority;
        private int incidents;
        private boolean certification;

        double calculateExtraSalary(){
            double result = 0;

            if(!isElegibleExtraSalary()){
                return result;
            }

            return result;
        }

        public boolean isElegibleExtraSalary() {
            boolean estudios = seniority < 1 || education < 1;
            boolean antiguedad = incidents > 10 && certification;
            return estudios || antiguedad;
        }

    }