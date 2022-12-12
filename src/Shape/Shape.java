package Shape;



    public abstract class Shape implements ShapeInheritance{
        private String type;


        public  Shape(String type){

            setType(type);
        }


        public void setType(String type) {
            this.type = type;
        }


        public String getType() {
            return type;
        }

        public abstract double area();

        public String toString() {
            return getType();
        }
    }

