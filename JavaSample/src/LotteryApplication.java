import java.util.Random;
public class LotteryApplication {
	private int [ ] lotteryNumber;	
	private int[ ] userLotteryNumbers;
	
	public void getUsersLotteryNumbers( int [] userLotteryNumbersGiven){
		this.userLotteryNumbers=userLotteryNumbersGiven;
	}
	
	
	public int[ ] getlotteryNumbers (){
		return lotteryNumber;
	}
	
	
	public int [ ] compareLotteryNumbers(){
		int [] matchedNumbers = new int [ lotteryNumber.length ];
		for( int currentUserLotteryNumberIndex=0 ;  currentUserLotteryNumberIndex<userLotteryNumbers.length ; currentUserLotteryNumberIndex++ ){
			if(userLotteryNumbers[currentUserLotteryNumberIndex] == lotteryNumber[currentUserLotteryNumberIndex]){
				matchedNumbers [currentUserLotteryNumberIndex ]= userLotteryNumbers[currentUserLotteryNumberIndex] ;
			}
		}
		return matchedNumbers;
	}
	
	
	public  LotteryApplication( int numberOfLotteryNumbers	){
		Random random= new Random();
		lotteryNumber=new int [numberOfLotteryNumbers];
		for( int currentLotteryNumberIndex =0; currentLotteryNumberIndex<  lotteryNumber.length ;currentLotteryNumberIndex++ ){
			lotteryNumber[currentLotteryNumberIndex ] =random.nextInt(10);// provide 0 to 9 10 does not included 10 in the range.			
		}	
	}
}
