function switchItUp(number) {
	return number === 0
		? 'Zero'
		: number === 1
		? 'One'
		: number === 2
		? 'Two'
		: number === 3
		? 'Three'
		: number === 4
		? 'Four'
		: number === 5
		? 'Five'
		: number === 6
		? 'Six'
		: number === 7
		? 'Seven'
		: number === 8
		? 'Eight'
		: number === 9
		? 'Nine'
		: NaN;
}

// // CLEVER
// switchItUp = n =>
// 	[
// 		'Zero',
// 		'One',
// 		'Two',
// 		'Three',
// 		'Four',
// 		'Five',
// 		'Six',
// 		'Seven',
// 		'Eight',
// 		'Nine',
// 	][n];
