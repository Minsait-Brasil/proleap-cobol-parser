/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.impl;

import io.proleap.cobol.Cobol85Parser.LiteralContext;
import io.proleap.cobol.asg.metamodel.BooleanLiteral;
import io.proleap.cobol.asg.metamodel.FigurativeConstant;
import io.proleap.cobol.asg.metamodel.Literal;
import io.proleap.cobol.asg.metamodel.ProgramUnit;

public class LiteralImpl extends CobolDivisionElementImpl implements Literal {

	protected BooleanLiteral booleanLiteral;

	protected final LiteralContext ctx;

	protected FigurativeConstant figurativeConstant;

	protected Type type;

	protected final String value;

	public LiteralImpl(final String value, final ProgramUnit programUnit, final LiteralContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
		this.value = value;
	}

	@Override
	public BooleanLiteral getBooleanLiteral() {
		return booleanLiteral;
	}

	@Override
	public LiteralContext getCtx() {
		return ctx;
	}

	@Override
	public FigurativeConstant getFigurativeConstant() {
		return figurativeConstant;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void setBooleanLiteral(final BooleanLiteral booleanLiteral) {
		this.booleanLiteral = booleanLiteral;
	}

	@Override
	public void setFigurativeConstant(final FigurativeConstant figurativeConstant) {
		this.figurativeConstant = figurativeConstant;
	}

	@Override
	public void setType(final Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() + ", value=[" + value + "]";
	}
}
