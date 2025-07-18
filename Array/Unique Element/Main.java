public class Main {
    static int uniqueElement(int []a){
        int sumOfAllNumber = 0;
        for(int e: a){
            sumOfAllNumber += e;
        }
        int sumOfUniqueNumber = 0;
        for(int i=0; i<a.length; i++){
            boolean isDup = false;
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    isDup = true;
                    break;
                }
            }
            if(!isDup){
                sumOfUniqueNumber += a[i];
            }
        }
        return 2*sumOfUniqueNumber - sumOfAllNumber;
    }
    public static void main(String[] args) {
        int []a = {1,22,2,1,2,3,3};
        int element = uniqueElement(a);
        System.out.println(element);
    }
}
