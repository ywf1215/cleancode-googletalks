package com.daokin.cleancode.polymorphism;

class AdditionNode extends OpNode {

	@Override
	double evaluate() {
		return left.evaluate() + right.evaluate();
	}

}
