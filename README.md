## Overview
[![License: Unlicense](https://img.shields.io/badge/license-Unlicense-blue.svg)](http://unlicense.org/)
[![](https://img.shields.io/github/v/release/wewewe718/QrAndBarcodeScanner)](https://github.com/wewewe718/QrAndBarcodeScanner/releases/latest)

QR & Barcode Scanner is an ad-free, open-source scanner app. It uses the [ZXing][zxing] scanning library.

## Changes in this fork

The sentry dependency and tracking was removed. Now only the stacktrace is printed.
The access and change wifi state permissions are still required to be able to connect to a network, when a wifi qr code is scanned.

## Download

See the releases section.

## Screenshots

<img src="https://github.com/wewewe718/QrAndBarcodeScanner/blob/develop/images/screenshots/en/1_scan.png" width="180" height="320"/> <img src="https://github.com/wewewe718/QrAndBarcodeScanner/blob/develop/images/screenshots/en/2_scan_from_file.png" width="180" height="320"/> <img src="https://github.com/wewewe718/QrAndBarcodeScanner/blob/develop/images/screenshots/en/3_result.png" width="180" height="320"/> <img src="https://github.com/wewewe718/QrAndBarcodeScanner/blob/develop/images/screenshots/en/4_result_dark_theme.png" width="180" height="320"/> <img src="https://github.com/wewewe718/QrAndBarcodeScanner/blob/develop/images/screenshots/en/5_create.png" width="180" height="320"/> <img src="https://github.com/wewewe718/QrAndBarcodeScanner/blob/develop/images/screenshots/en/6_history.png" width="180" height="320"/> <img src="https://github.com/wewewe718/QrAndBarcodeScanner/blob/develop/images/screenshots/en/7_settings.png" width="180" height="320"/>

## Contributing

You can contribute by adding a translation on [Transifex][transifex], reporting a bug or asking for a feature.

## Supported Barcode Formats

### Read

The app can read the following barcode formats:
* [AZTEC][aztec]
* [CODABAR][codabar]
* [CODE-39][code_39]
* [CODE-93][code_93]
* [CODE-128][code_128]
* [DATA MATRIX][data_matrix]
* [EAN-8][ean_8]
* [EAN-13][ean_13]
* [ITF][itf]
* [PDF417][pdf417]
* [QR CODE][qr_code]
* [RSS 14][rss]
* [RSS EXPANDED][rss]
* [UPC-A][upc_a]
* [UPC-E][upc_e]
* [UPC-EAN EXTENSION][upc_ean]

### Create

The app can create the following barcode formats:
* [AZTEC][aztec]
* [CODABAR][codabar]
* [CODE 39][code_39]
* [CODE 93][code_93]
* [CODE 128][code_128]
* [DATA MATRIX][data_matrix]
* [EAN-8][ean_8]
* [EAN-13][ean_13]
* [ITF][itf]
* [PDF417][pdf417]
* [QR CODE][qr_code]
* [UPC-A][upc_a]
* [UPC-E][upc_e]

[zxing]: https://github.com/zxing/zxing
[transifex]: https://www.transifex.com/a-302/qr-barcode-scanner/
[aztec]: https://en.wikipedia.org/wiki/Aztec_Code
[codabar]: https://en.wikipedia.org/wiki/Codabar
[code_39]: https://en.wikipedia.org/wiki/Code_39
[code_93]: https://en.wikipedia.org/wiki/Code_93
[code_128]: https://en.wikipedia.org/wiki/Code_128
[data_matrix]: https://en.wikipedia.org/wiki/Data_Matrix
[ean_8]: https://en.wikipedia.org/wiki/EAN-8
[ean_13]: https://en.wikipedia.org/wiki/International_Article_Number
[itf]: https://en.wikipedia.org/wiki/Interleaved_2_of_5
[maxicode]: https://en.wikipedia.org/wiki/MaxiCode
[pdf417]: https://en.wikipedia.org/wiki/PDF417
[qr_code]: https://en.wikipedia.org/wiki/QR_code
[rss]: https://en.wikipedia.org/wiki/GS1_DataBar
[upc_a]: https://en.wikipedia.org/wiki/Universal_Product_Code
[upc_e]: https://en.wikipedia.org/wiki/Universal_Product_Code#UPC-E
[upc_ean]: https://en.wikipedia.org/wiki/Universal_Product_Code#EAN-13
[rs]: https://developer.android.com/guide/topics/renderscript/compute
