package com.nerdysoft;

public class Coordinats {

	private Integer id;
	private Integer firstA;
	private Integer firstB;
	private Integer secondA;
	private Integer secondB;
	private Integer thirdA;
	private Integer thirdB;
	private Integer fourthA;
	private Integer fourthB;
	
	public Coordinats(Integer id, Integer firstA, Integer firstB, Integer secondA, Integer secondB, Integer thirdA,
			Integer thirdB, Integer fourthA, Integer fourthB) {
		super();
		this.id = id;
		this.firstA = firstA;
		this.firstB = firstB;
		this.secondA = secondA;
		this.secondB = secondB;
		this.thirdA = thirdA;
		this.thirdB = thirdB;
		this.fourthA = fourthA;
		this.fourthB = fourthB;
	}

	public Coordinats(Integer firstA, Integer firstB, Integer secondA, Integer secondB, Integer thirdA, Integer thirdB,
			Integer fourthA, Integer fourthB) {
		super();
		this.firstA = firstA;
		this.firstB = firstB;
		this.secondA = secondA;
		this.secondB = secondB;
		this.thirdA = thirdA;
		this.thirdB = thirdB;
		this.fourthA = fourthA;
		this.fourthB = fourthB;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFirstA() {
		return firstA;
	}

	public void setFirstA(Integer firstA) {
		this.firstA = firstA;
	}

	public Integer getFirstB() {
		return firstB;
	}

	public void setFirstB(Integer firstB) {
		this.firstB = firstB;
	}

	public Integer getSecondA() {
		return secondA;
	}

	public void setSecondA(Integer secondA) {
		this.secondA = secondA;
	}

	public Integer getSecondB() {
		return secondB;
	}

	public void setSecondB(Integer secondB) {
		this.secondB = secondB;
	}

	public Integer getThirdA() {
		return thirdA;
	}

	public void setThirdA(Integer thirdA) {
		this.thirdA = thirdA;
	}

	public Integer getThirdB() {
		return thirdB;
	}

	public void setThirdB(Integer thirdB) {
		this.thirdB = thirdB;
	}

	public Integer getFourthA() {
		return fourthA;
	}

	public void setFourthA(Integer fourthA) {
		this.fourthA = fourthA;
	}

	public Integer getFourthB() {
		return fourthB;
	}

	public void setFourthB(Integer fourthB) {
		this.fourthB = fourthB;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstA == null) ? 0 : firstA.hashCode());
		result = prime * result + ((firstB == null) ? 0 : firstB.hashCode());
		result = prime * result + ((fourthA == null) ? 0 : fourthA.hashCode());
		result = prime * result + ((fourthB == null) ? 0 : fourthB.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((secondA == null) ? 0 : secondA.hashCode());
		result = prime * result + ((secondB == null) ? 0 : secondB.hashCode());
		result = prime * result + ((thirdA == null) ? 0 : thirdA.hashCode());
		result = prime * result + ((thirdB == null) ? 0 : thirdB.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinats other = (Coordinats) obj;
		if (firstA == null) {
			if (other.firstA != null)
				return false;
		} else if (!firstA.equals(other.firstA))
			return false;
		if (firstB == null) {
			if (other.firstB != null)
				return false;
		} else if (!firstB.equals(other.firstB))
			return false;
		if (fourthA == null) {
			if (other.fourthA != null)
				return false;
		} else if (!fourthA.equals(other.fourthA))
			return false;
		if (fourthB == null) {
			if (other.fourthB != null)
				return false;
		} else if (!fourthB.equals(other.fourthB))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (secondA == null) {
			if (other.secondA != null)
				return false;
		} else if (!secondA.equals(other.secondA))
			return false;
		if (secondB == null) {
			if (other.secondB != null)
				return false;
		} else if (!secondB.equals(other.secondB))
			return false;
		if (thirdA == null) {
			if (other.thirdA != null)
				return false;
		} else if (!thirdA.equals(other.thirdA))
			return false;
		if (thirdB == null) {
			if (other.thirdB != null)
				return false;
		} else if (!thirdB.equals(other.thirdB))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Coordinats [id=" + id + ", firstA=" + firstA + ", firstB=" + firstB + ", secondA=" + secondA
				+ ", secondB=" + secondB + ", thirdA=" + thirdA + ", thirdB=" + thirdB + ", fourthA=" + fourthA
				+ ", fourthB=" + fourthB + "]";
	}
	
	
}
