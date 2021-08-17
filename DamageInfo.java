
public class DamageInfo {

	public static void damageinfo(String first, int second, int third) {
		
		String victim = first;
		int partHP = second;
		int damagepartHP = third;
		
		System.out.println("|"+ victim + "'S HEAD = " + partHP + "HP|  DAMAGE DEALT = " + damagepartHP + " |" + victim + " HP LEFT = " + (partHP - damagepartHP)+"|");
	}
}
