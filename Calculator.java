/**
* Класс реализует калькулятор
*/
public class Calculator
{
	/**
	* Результат вычислений
	*/
	private int result;

	/**
	* Суммируем параметры
	* @params - параметры для суммирования
	*/
	public void add(int... params) {
		for (Integer param: params) {
			this.result += param;
		}
	}

	/**
	* Получить результат
	* @return результат вычислений
	*/
	public int getResult() {
		return this.result;
	}

	/**
	* Очистить результат
	*/
	public void cleanResult() {
		this.result = 0;
	}



  
};