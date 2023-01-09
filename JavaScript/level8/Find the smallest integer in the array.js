class SmallestIntegerFinder {
	findSmallestInt(args) {
		const getMinNum = (a, b) => Math.min(a, b);
		return args.reduce(getMinNum);
	}
}
