package com.primary.extend;

public class equalsIphone {
	float screen = 5.5f;
	float cpu = 3.5f;
	String name = "iPhoneXR";
	//重写的equals方法
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		equalsIphone other = (equalsIphone) obj;
		if (Float.floatToIntBits(cpu) != Float.floatToIntBits(other.cpu))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(screen) != Float.floatToIntBits(other.screen))
			return false;
		return true;
	}
	
}
