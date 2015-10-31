# bufferplot

Displays buffer log from liquidsoap prettily.

## Installation

	lein bin

Binary will be in target/bufferplot

## Requirements

	libxi6
	librender1


## Usage

```sh
	./bufferplot "name for top of chart" /path/to/buffer.log output-filename.pdf
```

If you're running it on a server you should also:

```sh

	export DISPLAY=

```

Output format is just pdf for now.

## Options

None yet

## Examples



### Bugs


## License

Copyright © 2014 ken restivo <ken@restivo.org>

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
