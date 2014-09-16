package com.daokin.cleancode.polymorphism;

class MultiplicationNode extends OpNode {

	@Override
	double evaluate() {
		return left.evaluate() * right.evaluate();
	}

}
