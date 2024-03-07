public class patient extends person
{
        private String condition;

        public patient(String name, int age, String condition)
        {
            super(name, age);
            this.condition = condition;
        }

    // Getters and setters
        public String getCondition()
        {
            return condition;
        }

        public void setCondition(String condition)
        {
            this.condition = condition;
        }

        //Output override
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Condition: " + condition);
        }
    }

