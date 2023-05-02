package day5.dateTimeCurrency;

import java.util.Currency;
import java.util.Locale;

public class CurrencyAPI {
	public static void main(String[]args) {
		Currency currency = Currency.getInstance(Locale.JAPAN);
		System.out.println(currency.getCurrencyCode());
		System.out.println(currency.getSymbol());
		System.out.println(currency.getDisplayName());
		
		System.out.println(Currency.getInstance(Locale.getDefault()).getCurrencyCode());
		System.out.println(Currency.getInstance(Locale.getDefault()).getSymbol());
		System.out.println(Currency.getInstance(Locale.getDefault()).getDisplayName());
		System.out.println(Locale.getAvailableLocales());
	}
}
