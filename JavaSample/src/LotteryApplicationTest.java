import java.util.Scanner;

/**
 * 
 */

/**
 * @author macbookpro
 *
 */
public class LotteryApplicationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int userlotteryNumber;
final int  NO_OF_LOTTERY_NUMBERS=5;



int [] userlotteryNumbers= new int[NO_OF_LOTTERY_NUMBERS] ;
int [] matchedNumbers= new int[NO_OF_LOTTERY_NUMBERS] ;
int [] lotterNumbers= new int[NO_OF_LOTTERY_NUMBERS] ;
int numbersOfMatchedNumber=0;

		Scanner keyboard =  new Scanner(System.in);
		LotteryApplication worldLottery = new LotteryApplication(NO_OF_LOTTERY_NUMBERS);
	
		
		for( int currentLotterNumberindex =0; currentLotterNumberindex<NO_OF_LOTTERY_NUMBERS ; currentLotterNumberindex++){
			System.out.println("Please enter lottery number ::  "+ currentLotterNumberindex + 1);
			userlotteryNumber= keyboard.nextInt();
			userlotteryNumbers [currentLotterNumberindex] = userlotteryNumber;
		}
		
		
		worldLottery.getUsersLotteryNumbers(userlotteryNumbers);
		matchedNumbers = worldLottery.compareLotteryNumbers();
		lotterNumbers=	worldLottery.getlotteryNumbers();
		
		
		for(int currentLotteryNumberIndex =0 ; currentLotteryNumberIndex<lotterNumbers.length; currentLotteryNumberIndex++){
		System.out.println("lottery numbers ...     "+ lotterNumbers[currentLotteryNumberIndex]+  " , ");
			
		}
		
		
		System.out.println(".............");

		for(int currentLotteryNumberIndex =0 ; currentLotteryNumberIndex<userlotteryNumbers.length; currentLotteryNumberIndex++){
			System.out.println("your  numbers ...     "+ userlotteryNumbers[currentLotteryNumberIndex]+ " , ");
				
			}
		System.out.println(".............");

		
		
		for(int currentLotteryNumberIndex =0 ; currentLotteryNumberIndex<matchedNumbers.length; currentLotteryNumberIndex++){
			if(matchedNumbers[currentLotteryNumberIndex]!=-1){
				System.out.println("matched numbers ...     "+ matchedNumbers[currentLotteryNumberIndex]+ "   Slot(  " +  currentLotteryNumberIndex+1  + " ), ");
numbersOfMatchedNumber+=1;
			}
			
			}		
		
		if(numbersOfMatchedNumber == NO_OF_LOTTERY_NUMBERS){
			System.out.println("..you matched .all numbers...");
		}else{
			System.out.println("..you matched . "+numbersOfMatchedNumber +" numbers...");

			
		}	
	}

}
