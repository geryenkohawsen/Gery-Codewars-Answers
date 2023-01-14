function getMiddle(s) {
	const findMidStr = () => Math.floor(s.length / 2);
	if (s.length % 2 === 0) {
		return s[findMidStr() - 1] + s[findMidStr()];
	} else {
		return s[findMidStr()];
	}
}
