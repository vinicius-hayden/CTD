const { generateText } = require('../util.js');

test('age and name output', () => {
    const text = generateText('Vinicius Hayden', 18);
    expect(text).toBe('Vinicius Hayden (18 years old)');

})
