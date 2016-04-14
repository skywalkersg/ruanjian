import javax.swing.JOptionPane;


public class HanShu {
	int Benmoney;  //本金
	double lilu;   //年利率
	long year;     //年限
	double Future;    //复利终值
	int bonusTime;  //复利次数
	double i;
	double investment;  //定义投资回报
	double repayment;   //还款金额
	boolean lawful = false;  //判断数据合法性
	
	public HanShu(String B, String L, String Y, String C, String F){   //录入数据并判断合法性
		if(B==null || B.length()<=0)
			Benmoney=0;
		else{
			try{
				Benmoney=Integer.parseInt(B);
			}catch(Exception e){
				lawful=true;
			}
		}
		
		if(L==null || L.length()<=0)
			lilu=0;
		else{
			try{
				lilu=Double.parseDouble(L);
			}catch(Exception e){
				lawful=true;
			}
		}
		
		if(Y==null || Y.length()<=0)
			year=0;
		else{
			try{
			    year=Integer.parseInt(Y);
			}catch(Exception e){
				lawful=true;
			}
		}
		
		if(C==null || C.length()<=0)
			bonusTime=0;
		else{
			try{
				bonusTime=Integer.parseInt(C);
			}catch(Exception e){
				lawful=true;
			}
		}

		if(F==null || F.length()<=0)
			Future=0;
		else{
			try{
				Future=Double.parseDouble(F);
			}catch(Exception e){
				lawful=true;
			}
		}
		
		if(lawful==true){
			JOptionPane.showMessageDialog(null, "输入数据不合法，请重新输入", "数据不合法", JOptionPane.ERROR_MESSAGE);
		}
		
		i = Math.pow(1.0 + lilu/bonusTime, bonusTime) - 1;
	}
	
	public double SuanFa01(){
		i = Math.pow(1.0 + lilu/bonusTime, bonusTime) - 1;
		Future=(int)Benmoney*Math.pow((1.0+i), year);  //求复利终值
		return Future;
		}
	
	public double SuanFa02(){		
		Benmoney=Integer.parseInt(String.valueOf(Future*Math.pow((1.0+i), -year)));  //求本金
		return Benmoney;		
	}
	
	public double Time(){
		year=(int)(Math.log(Future/Benmoney)/Math.log(1+i))+1;   //求年份
		return year;
	}
	
	public double Li(){
		lilu=(double)(Math.pow((Future/Benmoney), (1.0/year))-1.0);   //求利率
		return lilu;
	}
	
	public double HuiBao(){
		investment=(double)Benmoney * (1 + lilu) * (Math.pow((1 + lilu), year) - 1) / lilu;  //投资回报
		return investment;
	}
	
	public double HuanKuan(){
		repayment=(double)Benmoney * (lilu / 12) * Math.pow((1 + (lilu / 12)), (year * 12)) /     //求还款金额
				(Math.pow((1 + (lilu / 12)), (year * 12)) - 1);
		return repayment;
	}

}
