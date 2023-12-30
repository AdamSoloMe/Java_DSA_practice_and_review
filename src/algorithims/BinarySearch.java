package algorithims;

public class BinarySearch {



    //this is the binary search Algorthim
    public static int binarySearch(int nums[],int key){
        int low=0;
        int high= nums.length-1;
        while (low <= high){
            System.out.println("this is low index each tim "+low);
            int mid=(high+low)/2;
            System.out.println("this is mid index each time "+mid);
            if(nums[mid]==key){
                return mid;
            }
            if(key < nums[mid]){
                high = mid -1;
                System.out.println("this is high index each time "+high);
            }else{
                low=mid+1;
                System.out.println("this is the new low index each time "+low);
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int unsorted[]={15,10,20,8,12,6,11,17,25,16,27};
        System.out.println(BinarySearch.binarySearch(unsorted,17));


    }
}
