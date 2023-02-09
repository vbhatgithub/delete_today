
public class RetryFailedTestsCases implements IRetryAnalyzer{
	
	private int retryCnt = 0;
	private int maxretryCnt = 1;
	
	public boolean retry(ITestResult result) {
		
		if(retryCnt<=maxretryCnt) {
			System.out.println("Retrying " + result.getName()+ " again and the count is " + (retryCnt + 1));
			retryCnt++;
			return true;
		}
		
		return false;
		
	}
	

}
