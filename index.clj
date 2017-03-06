{:namespaces
 ({:doc
   "\nThe API below was written regarding to the source code\nof different Webdriver implementations. All of them partially\ndiffer from the official W3C specification.\n\nThe standard:\nhttps://www.w3.org/TR/webdriver/\n\nChrome:\nhttps://github.com/bayandin/chromedriver/\n\nFirefox (Geckodriver):\nhttps://github.com/mozilla/webdriver-rust/\n\nPhantom.js (Ghostdriver)\nhttps://github.com/detro/ghostdriver/blob/\n",
   :name "etaoin.api",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.api-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj"}
  {:doc nil,
   :name "etaoin.client",
   :wiki-url
   "https://igrishaev.github.io/etaoinetaoin.client-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/4d4cbea1e9d6df2d37831a8e2652287f65faf535/src/etaoin/client.clj"}
  {:doc "https://www.w3.org/TR/webdriver/#keyboard-actions",
   :name "etaoin.keys",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.keys-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/96eb261742e5ec4fad818fb9ff4f8ead54494b09/src/etaoin/keys.clj"}
  {:doc nil,
   :name "etaoin.proc",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.proc-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/96eb261742e5ec4fad818fb9ff4f8ead54494b09/src/etaoin/proc.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "back",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L353",
   :line 353,
   :var-type "function",
   :arglists ([driver]),
   :doc "Move backwards in a browser's history.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/back"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "boot-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1468",
   :line 1468,
   :var-type "function",
   :arglists ([type & [opt]]),
   :doc
   "Three-in-one: creates a driver, starts a process and creates a new\nsession. Returns the driver instance.\n\nArguments:\n\n- `type` a keyword determines a driver type.\n\n- `opt` a map of all possible parameters that `create-driver`,\n`run-driver` and `connect-driver` may accept.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/boot-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "chrome",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1497",
   :line 1497,
   :var-type "var",
   :arglists nil,
   :doc "Launches Chrome driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/chrome"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "clear",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1253",
   :line 1253,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Clears an element (input, textarea) found with a query.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/clear"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "close-window",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L221",
   :line 221,
   :var-type "multimethod",
   :arglists nil,
   :doc "Closes the current browser window.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/close-window"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "connect-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1439",
   :line 1439,
   :var-type "function",
   :arglists ([driver & [opt]]),
   :doc
   "Connects to a running Webdriver server.\n\nCreates a new session on Webdriver HTTP server. Sets the session to\nthe driver. Returns the modified driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/connect-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "create-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1358",
   :line 1358,
   :var-type "function",
   :arglists ([type & [opt]]),
   :doc
   "Creates a new driver instance.\n\nReturns an atom that represents driver's state. Some functions, for\nexample creating or deleting a session may change its state.\n\nThe function does not start a process or open a window. It just\ncreates an atom without side effects.\n\nArguments:\n\n- `type` is a keyword determines what driver to use. The supported\nbrowsers are `:firefox`, `:chrome`, `:phantom` and `:safari`.\n\n- `opt` is a map with additional options for a driver. The supported\noptions are:\n\n-- `:host` is a string with either IP or hostname. Use it if the\nserver is run not locally but somethere in your network.\n\n-- `:port` is an integer value what HTTP port to use. It is taken\nfrom the `default-ports` global map if is not passed. If there is no\nport in that map, a random-generated port is used.\n\n-- `:locator` is a string determs what algorithm to use by default\nwhen finding elements on a page. `default-locator` variable is used\nif not passed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/create-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "create-session",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L129",
   :line 129,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Initiates a new session for a driver. Opens a browser window as a\nside-effect. All the further requests are made within specific\nsession. Some drivers may work with only one active session. Returns\na long string identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/create-session"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "default-paths",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L31",
   :line 31,
   :var-type "var",
   :arglists nil,
   :doc "Default commands to launch a driver process.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/default-paths"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "default-ports",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L38",
   :line 38,
   :var-type "var",
   :arglists nil,
   :doc "Default ports to launch a driver process.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/default-ports"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "defmethods",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L50",
   :line 50,
   :var-type "macro",
   :arglists ([multifn dispatch-vals & fn-tail]),
   :doc
   "Declares multimethods in batch. For each dispatch value from\ndispatch-vals, creates a new method.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/defmethods"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "disconnect-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1450",
   :line 1450,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Disconnects from a running Webdriver server.\n\nCloses the current session that is stored in the driver. Removes the\nsession from the driver instance. Returns modified driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/disconnect-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "dispatch-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L65",
   :line 65,
   :var-type "function",
   :arglists ([driver & _]),
   :doc
   "Returns the current driver's type. Used as dispatcher in\nmultimethods.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/dispatch-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "fill",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1243",
   :line 1243,
   :var-type "function",
   :arglists ([driver q text]),
   :doc "Fills an element found with a query with a given text.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "fill-human",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1290",
   :line 1290,
   :var-type "function",
   :arglists ([driver q text]),
   :doc
   "Fills text like humans do: with error, corrections and pauses.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `q`: a query term, see `query` function for more info,\n\n- `text`: a string to input.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill-human"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "firefox",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1493",
   :line 1493,
   :var-type "var",
   :arglists nil,
   :doc "Launches Firefox driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/firefox"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "forward",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L367",
   :line 367,
   :var-type "function",
   :arglists ([driver]),
   :doc "Move forwards in a browser's history.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/forward"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "get-element-size",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L626",
   :line 626,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Returns an element size as a map with :width and :height keys.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-size"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "get-status",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L120",
   :line 120,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Returns the current Webdriver status info. The content depends on\nspecific driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-status"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "get-title",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L386",
   :line 386,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns the current window's title.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-title"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "get-url",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L378",
   :line 378,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns the current URL string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-url"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "get-window-handle",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L176",
   :line 176,
   :var-type "multimethod",
   :arglists nil,
   :doc "Returns the current active window handler as a string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-handle"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "get-window-handles",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L196",
   :line 196,
   :var-type "multimethod",
   :arglists nil,
   :doc "Returns a vector of all window handlers.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-handles"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "get-window-position",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L269",
   :line 269,
   :var-type "multimethod",
   :arglists nil,
   :doc
   "Returns a window position relative to your screen as a map with\n`:x` and `:y` keys.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-position"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "get-window-size",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L248",
   :line 248,
   :var-type "multimethod",
   :arglists nil,
   :doc
   "Returns a window size a map with `:width` and `:height` keys.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-size"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "go",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L340",
   :line 340,
   :var-type "function",
   :arglists ([driver url]),
   :doc
   "Open the URL the current window.\n\nExample:\n\n(def ff (firefox))\n(go ff \"http://google.com\")",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/go"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "make-url",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1340",
   :line 1340,
   :var-type "function",
   :arglists ([host port]),
   :doc "Makes an Webdriver URL from a host and port.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/make-url"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "maximize",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L231",
   :line 231,
   :var-type "multimethod",
   :arglists nil,
   :doc "Makes the browser window as wide as your screen allows.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/maximize"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "phantom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1501",
   :line 1501,
   :var-type "var",
   :arglists nil,
   :doc "Launches Phantom.js driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/phantom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "port-args",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1345",
   :line 1345,
   :var-type "multimethod",
   :arglists nil,
   :doc
   "Returns a vector of port arguments specific for each driver type.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/port-args"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "q-expand",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L430",
   :line 430,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Expands a query expression into a pair of `[locator, term]` values\nto pass them into low-level HTTP API. Throws a Slingshot exception\nin case of unsupported clause.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/q-expand"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "q-xpath",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L398",
   :line 398,
   :var-type "function",
   :arglists ([q]),
   :doc
   "Turns a map into an XPath clause. The rules are:\n\n- `:tag` value becomes a tag name, otherwise `*` is used;\n\n- `:index` becomes a `[x]` at the end of expression if passed;\n\n- any other key-value pair becomes an attribute filter as follows:\n`{:foo \"one\" :baz \"two\"}` => `\"[@foo='one'][@bar='two']\"`.\n\n- the final XPath is always relative (started with `.//`) to make it\nwork with nested expressions.\n\nExample:\n\n(q-xpath {:tag :a :class :large :index 2 :target :_blank})\n> \".//a[@class='large'][@target='_blank'][2]\"",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/q-xpath"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "query",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L492",
   :line 492,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Finds an element on a page.\n\nA query might be:\n\n- a string, so the current browser's locator will be used. Examples:\n\n//div[@id='content'] for XPath,\ndiv.article for CSS selector\n\n- a keyword :active that means the current active element\n\n- a map with either :xpath or :css keys with a string term, e.g:\n{:xpath \"//div[@id='content']\"} or\n{:css \"div.article\"}\n\n- a map that will turn into an XPath expression:\n{:tag :div} => .//div\n{:id :container} => .//*[@id='container']\n{:tag :a :class :external :index 2} => .//a[@class='external'][2]\n\n- a vector of any clause mentioned above. In that case,\nevery next term is searched inside the previous one. Example:\n[{:id :footer} {:tag :a}] => finds the first hyperlink\ninside a div with id 'footer'.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/query"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "quit",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1485",
   :line 1485,
   :var-type "function",
   :arglists ([driver]),
   :doc "Closes the current session and stops the driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/quit"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "random-port",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L57",
   :line 57,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a random port skiping the first 1024 ones.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/random-port"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "refresh",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L360",
   :line 360,
   :var-type "function",
   :arglists ([driver]),
   :doc "Reloads the current window.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/refresh"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "run-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1401",
   :line 1401,
   :var-type "function",
   :arglists ([driver & [opt]]),
   :doc
   "Runs a driver process locally.\n\nCreates a UNIX process with a Webdriver HTTP server. Host and port\nare taken from a `driver` argument. Updates a driver instance with\nnew fields with process information. Returns modified driver.\n\nArguments:\n\n- `driver` is an atom created with `create-driver` function.\n\n- `opt` is an optional map with the following possible parameters:\n\n-- `:path` is a string path to a binary file to\nlaunch. `default-paths` global map is used for lookup when not\npassed.\n\n-- `:args` is a vector of additional arguments passed when starting\na process.\n\n-- `:env` is a map with system ENV variables. Keys are turned to\nupper-case strings.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/run-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "safari",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1505",
   :line 1505,
   :var-type "var",
   :arglists nil,
   :doc "Launches Safari driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/safari"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "screenshot",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1311",
   :line 1311,
   :var-type "multimethod",
   :arglists nil,
   :doc
   "Takes a screenshot of the current page. Saves it in a *.png file on disk.\nRises exception if a screenshot is empty.\n\nArguments:\n\n- `driver`: driver instance,\n\n- `filename`: full path to a file.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/screenshot"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "set-window-position",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L328",
   :line 328,
   :var-type "function",
   :arglists ([driver {:keys [x y]}] [driver x y]),
   :doc
   "Sets new position for a window. Absolute precision is not\nguaranteed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-window-position"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "set-window-size",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L306",
   :line 306,
   :var-type "function",
   :arglists ([driver {:keys [width height]}] [driver width height]),
   :doc
   "Sets new size for a window. Absolute precision is not guaranteed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-window-size"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "stop-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1460",
   :line 1460,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Stops the driver's process. Removes proces's data from the driver\ninstance. Returns a modified driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/stop-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "submit",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1262",
   :line 1262,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Sends Enter button value to an element found with query.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/submit"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "switch-window",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L214",
   :line 214,
   :var-type "function",
   :arglists ([driver handle]),
   :doc "Switches a browser to another window.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/switch-window"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "wait",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1072",
   :line 1072,
   :var-type "function",
   :arglists ([driver sec] [sec]),
   :doc "Does nothing for N seconds.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "when-chrome",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1204",
   :line 1204,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc
   "Executes the body only if the driver is Chrome.\n\nExample:\n\n(def driver (chrome))\n(when-chrome driver\n  (println \"It's Chrome!\")",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-chrome"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "when-firefox",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1221",
   :line 1221,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if the driver is Firefox.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-firefox"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "when-phantom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1216",
   :line 1216,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if the driver is Phantom.js.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-phantom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "when-safari",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1226",
   :line 1226,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if the driver is Safari.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-safari"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "with-chrome",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1546",
   :line 1546,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Chrome session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-chrome"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "with-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1509",
   :line 1509,
   :var-type "macro",
   :arglists ([type opt bind & body]),
   :doc
   "Performs the body within a driver session.\n\nLaunches a driver of a given type. Binds the driver instance to a\npassed `bind` symbol. Executes the body once the driver has\nstarted. Shutdowns the driver finally (even if an exception\noccurred).\n\nArguments:\n\n- `type` is a keyword what driver type to start.\n\n- `opt` is a map with driver's options. See `boot-driver` for more\ndetails.\n\n- `bind` is a symbol to bind a driver reference.\n\nExample:\n\n(with-driver :firefox {} driver\n  (go driver \"http://example.com\"))",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "with-firefox",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1539",
   :line 1539,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Firefox session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-firefox"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "with-phantom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1553",
   :line 1553,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Phantom.js session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-phantom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "with-resp",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L75",
   :line 75,
   :var-type "macro",
   :arglists ([driver method path data result & body]),
   :doc
   "Executes an HTTP request to a driver's server. Performs the body\nwithin result data bound to the `result` clause.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `method`: a keyword represents HTTP method, e.g. `:get`, `:post`,\n`:delete`, etc.\n\n- sdfsdf  `dsfsd`\n\n- `path`: a vector of strings/keywords represents a server's\npath. For example:\n\n`[:session \"aaaa-bbbb-cccc\" :element \"dddd-eeee\" :find]`\n\nwill turn into \"/session/aaaa-bbbb-cccc/element/dddd-eeee/find\".\n\n- `data`: any data sctructure to be sent as JSON body. Put `nil` For\n`GET` requests.\n\n- `result`: a symbol to bind the data from the HTTP response with\n`let` form before executing the body.\n\nExample:\n\n(def driver (firefox))\n(with-resp driver :get\n  [:session (:session @driver) :element :active]\n  nil resp\n  (print resp))",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-resp"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj",
   :name "with-safari",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/36b3da4ef5b53aaa724c58ebf464e868fcc41a9c/src/etaoin/api.clj#L1560",
   :line 1560,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Safari session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-safari"})}
