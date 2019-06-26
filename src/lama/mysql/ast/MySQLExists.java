package lama.mysql.ast;

public class MySQLExists extends MySQLExpression {

	private final MySQLExpression expr;
	private final MySQLConstant expected;

	public MySQLExists(MySQLExpression expr, MySQLConstant expectedValue) {
		this.expr = expr;
		this.expected = expectedValue;
	}

	public MySQLExists(MySQLExpression expr) {
		this.expr = expr;
		this.expected = expr.getExpectedValue();
		if (expected == null) {
			throw new AssertionError();
		}
	}

	public MySQLExpression getExpr() {
		return expr;
	}

	@Override
	public MySQLConstant getExpectedValue() {
		return expected;
	}

}
