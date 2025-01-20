package lab5.prob1.rulesets;

import java.awt.Component;

import lab5.prob1.gui.BookWindow;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */

public class BookRuleSet implements RuleSet {

	private BookWindow bookWindow;
	@Override
	public void applyRules(Component ob) throws RuleException {
		bookWindow = (BookWindow) ob;
		nonemptyRule();
		isbnNumericRule();
		isbn10Or13DigitsRule();
		isbn10DigitsFirstNumberRule();
		isbn13DigitsFirstThreeRule();
		isPrice2DecimalFloatingRule();
		isPriceGreaterThan();
	}

	private void nonemptyRule() throws RuleException {
		String isbn = bookWindow.getIsbnValue().trim();
		String price = bookWindow.getPriceValue().trim();
		String title = bookWindow.getTitleValue().trim();

		if(isbn.isEmpty() || price.isEmpty() || title.isEmpty()) {
			throw new RuleException("All Book fields must no be empty");
		}
	}

	private void isbnNumericRule() throws RuleException {
		String isbn = bookWindow.getIsbnValue().trim();
		try {
			Long.parseLong(isbn);
		} catch(NumberFormatException e) {
			throw new RuleException("ISBN must be numeric");
		}
	}


	private void isbn10Or13DigitsRule() throws RuleException {
		String isbn = bookWindow.getIsbnValue().trim();
		if(!isbn.isEmpty() && (isbn.length() != 10 && isbn.length() != 13)) {
			throw new RuleException("ISBN number must be numeric with 10 or 13 digits");
		}
	}

	private void isbn10DigitsFirstNumberRule() throws RuleException {
		String isbn = bookWindow.getIsbnValue().trim();
		if(isbn.length() == 10 && !(isbn.startsWith("0") || isbn.startsWith("1"))) {
			throw new RuleException("ISBN of 10 digits should start with 0 or 1");
		}
	}

	private void isbn13DigitsFirstThreeRule() throws RuleException {
		String isbn = bookWindow.getIsbnValue().trim();
		if(isbn.length() == 13 && !(isbn.startsWith("978") || isbn.startsWith("979"))) {
			throw new RuleException("If ISBN has length 13, the first three digits must be 978 or 979.");
		}
	}

	private void isPrice2DecimalFloatingRule() throws RuleException {
		String bookPrice = bookWindow.getPriceValue().trim();
		try {
			double parsedPrice = Double.parseDouble(bookPrice);
			// Multiply by 100 and check if it's an integer
			if ((parsedPrice * 100) % 1 != 0) {
				throw new RuleException("Price must be a floating point number with two decimal places.");
			}
		} catch (RuleException e) {
			throw new RuleException(e.getMessage());
		}

	}

	private void isPriceGreaterThan() throws RuleException{
		String bookPrice = bookWindow.getPriceValue().trim();
		if(Double.parseDouble(bookPrice) <= 0.49) {
			throw new RuleException("Price must be greater than 0.49");
		}
	}
}
