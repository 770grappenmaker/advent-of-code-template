# Using aocd for puzzle inputs
If you do not want to manually download your puzzle inputs, you can instead use a library, called `advent-of-code-data`.
Install it using `pip install advent-of-code-data`.

## Prerequisites
In order to make automatic requests on your behalf, you have to retrieve your session token. Note that this token is a browser cookie.
Using tools to automate requests to the Advent of Code website is allowed, but the creator has put out some rules and guidelines: [here](https://www.reddit.com/r/adventofcode/comments/a1qovy/please_dont_spam_requests_to_aoc/) and [here](https://old.reddit.com/r/adventofcode/wiki/faqs/automation#wiki_rules_for_automated_tools).
The `advent-of-code-data` libraries follows these rules, but still, use it at your own risk.

There are two ways to obtain your session token:
<details>
<summary>Using <code>aocd-token</code> (Linux only)</summary>
<ol>
<li>Install <code>browser-cookie3</code>: <code>pip install browser-cookie3</code></li>
<li>Run <code>aocd-token > ./aocd/token</code></li>
</ol>
</details>
<details>
<summary>Manually</summary>
1. Log in to `adventofcode.com` in your favorite browser.
2. Open a Developer tools window (typically Ctrl-Shift-I or F12)
3. Search for "Application" or "Storage", then "Cookies"
4. Copy the value of the "session" cookie
5. Put its value in a file with the name `token`
</details>

## Usage
1. Create a Python file, like `day05.py` for day 5. You can copy over the example code for day 1 (in `alternative.py`).
2. Solve the problem, write some code for it, and run it. Running works the same as in the default "style".
