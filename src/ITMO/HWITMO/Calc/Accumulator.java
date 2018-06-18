package ITMO.HWITMO.Calc;


    public class Accumulator {
        private double value;
        private Operation operation;
        public Accumulator(Operation operation, double value){
            this.value = value;
            this.operation = operation;
        }

        protected void accumulator(double EntInt){
            this.value = this.operation.execute(this.value, EntInt);
        }

        public double getValue(){
            return this.value;
        }

        public static void main(String[] args) {
            Accumulator acc1 = new Accumulator(new Summation(), 3);
            System.out.println(acc1.getValue());
            acc1.accumulator(5);
            System.out.println(acc1.getValue());

            Accumulator acc2 = new Accumulator(new Subtraction(), 7);
            System.out.println(acc2.getValue());
            acc2.accumulator(8);
            System.out.println(acc2.getValue());

            Accumulator acc3 = new Accumulator(new Multiplication(), 7);
            System.out.println(acc3.getValue());
            acc3.accumulator(8);
            System.out.println(acc3.getValue());

            Accumulator acc4 = new Accumulator(new Division(), 16);
            System.out.println(acc4.getValue());
            acc4.accumulator(7);
            System.out.println(acc4.getValue());
        }
    }

