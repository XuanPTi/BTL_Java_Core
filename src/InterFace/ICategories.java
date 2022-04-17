package InterFace;

public interface ICategories<T> {
	static final float MIN_INTEREST_RATE = 0.2F;

	void ingputData(T t);

	void dislapyData(T t);
	void calProfit(T i);

}
