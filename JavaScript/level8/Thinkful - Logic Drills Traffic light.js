function updateLight(current) {
	return current === 'green'
		? 'yellow'
		: current === 'yellow'
		? 'red'
		: current === 'red'
		? 'green'
		: 'Traffic light is broken... 😫';
}
