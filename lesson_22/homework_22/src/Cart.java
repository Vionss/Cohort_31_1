import java.util.Arrays;

public class Cart {
        private int size=0;
        private Items [] arr = new Items[2];

        public void add (Items element){     ////
            if(size <arr.length) {
                arr[size] = element;
                size++;
            }else {
                increaseArray();
                arr[size] = element;
                size++;
            }
        }

        private void increaseArray(){
            Items [] tempArray= new Items [arr.length*2];////
            for (int i = 0; i < arr.length; i++) {
                tempArray[i] = arr[i];
            }

            arr = tempArray;
        }
        public String specialtoString (){
            return Arrays.toString(arr) + " size: " + size;
        }

        public Items[] getArr(){////
            Items [] tempArray= new Items [size];/////
            for (int i = 0; i < size; i++) {
                tempArray[i] = arr[i];
            }
            return tempArray;
        }

        public String toString (){
            String res = "[";
            for (int i = 0; i < size; i++) {
                res += " " + arr[i]+ "\n";
            }
            res+="]";
            return res;
        }

        public void remove(int index){
            if(index>0 && index <size){
                for (int i = index+1; i <size ; i++) {
                    arr[i-1] = arr[i];
                }
                size--;
            }
        }
        public int quantity(){
            return size;
        }

        public String  sum(){
            double sum = 0;
            for (int i = 0; i < size; i++) {
                sum+=arr[i].getPrice();
            }
            return sum+"$";
        }

        public  void placeOrder(){
            for (int i = 0; i < size; i++) {
                arr[i].buy();
            }
        }
}
