function findNextSquare(sq) {
	if (Math.sqrt(sq) % 1 !== 0) return -1;
	return (Math.sqrt(sq) + 1) ** 2;
}
