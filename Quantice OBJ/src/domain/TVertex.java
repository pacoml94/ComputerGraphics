package domain;

import java.math.BigDecimal;

public class TVertex {

	private BigDecimal x, y, z;

	public TVertex(BigDecimal x, BigDecimal y, BigDecimal z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public TVertex() {

	}

	@Override
	public String toString() {
		return "TVertex [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
