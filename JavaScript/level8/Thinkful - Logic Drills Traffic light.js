function updateLight(current) {
	return current === 'green'
		? 'yellow'
		: current === 'yellow'
		? 'red'
		: current === 'red'
		? 'green'
		: 'Traffic light is broken... 😫';
}

// // using object property
// const updateLight = (current) =>
// 	({
// 		green: 'yellow',
// 		yellow: 'red',
// 		red: 'green',
// 	}[current]);
