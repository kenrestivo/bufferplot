# bufferplot

Displays buffer log from liquidsoap prettily.

![Alt text](http://storage.restivo.org/images/buffer-small.jpg "Example")

## Build

	lein bin

Binary will be in target/bufferplot


## Installation
	You can
```sh
	sudo install -u root -g root target/bufferplot /usr/local/bin/bufferplot
```

## Requirements

	libxi6
	librender1


## Usage

```sh
	bufferplot "name for top of chart" /path/to/buffer.log output-filename.pdf
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

Copyright © 2014-2015 ken restivo <ken@restivo.org>

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
