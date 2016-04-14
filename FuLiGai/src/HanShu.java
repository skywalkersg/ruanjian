import javax.swing.JOptionPane;


public class HanShu {
	int Benmoney;  //����
	double lilu;   //������
	long year;     //����
	double Future;    //������ֵ
	int bonusTime;  //��������
	double i;
	double investment;  //����Ͷ�ʻر�
	double repayment;   //������
	boolean lawful = false;  //�ж����ݺϷ���
	
	public HanShu(String B, String L, String Y, String C, String F){   //¼�����ݲ��жϺϷ���
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
			JOptionPane.showMessageDialog(null, "�������ݲ��Ϸ�������������", "���ݲ��Ϸ�", JOptionPane.ERROR_MESSAGE);
		}
		
		i = Math.pow(1.0 + lilu/bonusTime, bonusTime) - 1;
	}
	
	public double SuanFa01(){
		i = Math.pow(1.0 + lilu/bonusTime, bonusTime) - 1;
		Future=(int)Benmoney*Math.pow((1.0+i), year);  //������ֵ
		return Future;
		}
	
	public double SuanFa02(){		
		Benmoney=Integer.parseInt(String.valueOf(Future*Math.pow((1.0+i), -year)));  //�󱾽�
		return Benmoney;		
	}
	
	public double Time(){
		year=(int)(Math.log(Future/Benmoney)/Math.log(1+i))+1;   //�����
		return year;
	}
	
	public double Li(){
		lilu=(double)(Math.pow((Future/Benmoney), (1.0/year))-1.0);   //������
		return lilu;
	}
	
	public double HuiBao(){
		investment=(double)Benmoney * (1 + lilu) * (Math.pow((1 + lilu), year) - 1) / lilu;  //Ͷ�ʻر�
		return investment;
	}
	
	public double HuanKuan(){
		repayment=(double)Benmoney * (lilu / 12) * Math.pow((1 + (lilu / 12)), (year * 12)) /     //�󻹿���
				(Math.pow((1 + (lilu / 12)), (year * 12)) - 1);
		return repayment;
	}

}
