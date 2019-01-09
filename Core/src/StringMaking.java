
public class StringMaking {
	private static String dynamicInputAsset(String originatingAsset){
		StringBuffer appendAssets = new StringBuffer();
		String assetValues = null;
		if(originatingAsset.trim().equals("") || originatingAsset != null ) {
			String[] assets = originatingAsset.split(",");
			for(String asset : assets) {
				appendAssets = appendAssets.append("'"+asset+"',");
			}
			assetValues = appendAssets.deleteCharAt(appendAssets.length()-1).toString();
		}
		return assetValues;
	}
	public static void main(String[] args) {
		System.out.println(StringMaking.dynamicInputAsset("OcA,SCEpp,ELITE,sce,OCA,BMI,ES,ngq,EZCIPCS").toUpperCase());
		
	}

}
