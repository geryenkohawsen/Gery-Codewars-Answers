function descendingOrder(n) {
	return Number(
		String(n)
			.split('')
			.sort((a, b) => b - a)
			.join('')
	);
}
