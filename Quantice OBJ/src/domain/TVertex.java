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

	public BigDecimal getX() {
		return x;
	}

	public void setX(BigDecimal x) {
		this.x = x;
	}

	public BigDecimal getY() {
		return y;
	}

	public void setY(BigDecimal y) {
		this.y = y;
	}

	public BigDecimal getZ() {
		return z;
	}

	public void setZ(BigDecimal z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "TVertex [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
}
