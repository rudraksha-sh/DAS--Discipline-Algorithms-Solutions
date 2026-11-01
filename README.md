<div align="center">

# 🚀 DAS | Discipline, Algorithms & Solutions | Java Core DSA Roadmap

### From Java & OOP Foundations to Problem-Solving Patterns

A focused, checkbox-driven roadmap inspired by **Striver's A2Z DSA Sheet**, with selected **LeetCode** problems, supplementary **Codeforces** practice, and GitHub-ready Java projects.

[![Language](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk)](https://www.java.com/)
[![DSA](https://img.shields.io/badge/Focus-DSA-blue?style=for-the-badge)](https://takeuforward.org/prep-hub/strivers-a2z-dsa-sheet)
[![Practice](https://img.shields.io/badge/Practice-LeetCode%20%7C%20Codeforces-yellow?style=for-the-badge)](https://leetcode.com/)
[![Progress](https://img.shields.io/badge/Approach-Pattern--First-success?style=for-the-badge)](#-how-to-use-this-roadmap)

</div>

---

## 🎯 Mission

Build strong Java fundamentals, learn reusable algorithmic patterns, and develop the ability to explain, implement, and analyze solutions independently.

**The rule:** understand the pattern first; increase the question count second.

## 🧭 Roadmap at a Glance

| Phase | Focus | Checklist |
|---|---|---:|
| [0](#phase-0--java--oop-foundations--github-projects) | Java, OOP and GitHub portfolio projects | 15 tasks |
| [1](#phase-1--arrays-hashing--prefix-sums) | Arrays, hashing and prefix sums | 8 problems |
| [2](#phase-2--sorting-two-pointers--sliding-window) | Sorting, two pointers and sliding window | 8 problems |
| [3](#phase-3--binary-search) | Binary search and answer-space search | 8 problems |
| [4](#phase-4--recursion--backtracking) | Recursion and backtracking | 8 problems |
| [5](#phase-5--linked-lists-stacks--queues) | Linked lists, stacks and queues | 8 problems |
| [6](#phase-6--trees--heaps) | Trees, BSTs and heaps | 8 problems |
| [7](#phase-7--graphs) | Graph traversal and shortest paths | 8 problems |
| [8](#phase-8--greedy--dynamic-programming) | Greedy and dynamic programming | 8 problems |
| [9](#phase-9--bit-manipulation--design) | Bit manipulation and data-structure design | 8 problems |

> **Suggested sequence:** complete Phase 0, then work through Phases 1–9 in order. Codeforces links are supplementary warm-ups; they are not always exact equivalents of the paired LeetCode problem.

---

## ✅ How to Use This Roadmap

- [ ] Use **Java** for every implementation.
- [ ] Spend 25–35 minutes attempting a problem before checking hints.
- [ ] Write the brute-force approach first, then identify the bottleneck and optimize.
- [ ] Explain the key invariant or state transition before coding.
- [ ] Record time complexity and auxiliary-space complexity.
- [ ] Test edge cases, duplicates, minimum inputs, and integer overflow where relevant.
- [ ] Re-solve difficult problems after 3–7 days without looking at the solution.
- [ ] Use meaningful Git commits and add short notes about what each solution teaches.

---

# Phase 0 — Java & OOP Foundations + GitHub Projects

**Goal:** turn core Java and object-oriented programming concepts into small, demonstrable projects—not just theory notes.

**Suggested repository:** `java-oop-foundations`

- [ ] **01 — Java Basics:** Console calculator using operators, conditionals, loops and input validation.
- [ ] **02 — Methods, Arrays & Strings:** Utility library for reversing arrays/strings, counting frequencies, checking palindromes and finding min/max.
- [ ] **03 — Classes & Objects:** Student/course registration model with constructors and validation.
- [ ] **04 — Encapsulation:** `BankAccount` with deposit/withdraw operations, balance invariants and transaction history.
- [ ] **05 — Inheritance vs Composition:** University people model; demonstrate when composition is preferable to inheritance.
- [ ] **06 — Polymorphism:** Shape-area calculator using an interface and multiple implementations.
- [ ] **07 — Abstract Class vs Interface:** Payment or notification service with multiple implementations and a short design note.
- [ ] **08 — Collections Framework:** Contact book using `HashMap`, with add/search/update/delete operations.
- [ ] **09 — `equals()` and `hashCode()`:** Employee value object; test correct behaviour inside `HashSet`.
- [ ] **10 — Generics & Comparators:** Generic `Pair`/`Box` plus employee sorting using `Comparator` and lambdas.
- [ ] **11 — Exceptions & Validation:** Input validation with custom exceptions and meaningful error messages.
- [ ] **12 — Mini Design: Library Management CLI:** `Book`, `Member`, `Loan` and `LibraryService`, using encapsulation and composition.
- [ ] **13 — Mini Design: Parking Lot:** Vehicle types, parking spots, fee calculation and extensible interfaces.
- [ ] **14 — Unit Testing:** Add JUnit tests for boundary cases and invalid inputs to at least two projects.
- [ ] **15 — GitHub Polish:** README, project structure, setup steps, example output, tests and lessons learned.

### 🧰 Suggested project structure

```text
java-oop-foundations/
├── 01-java-basics/
├── 02-arrays-strings/
├── 03-classes-objects/
├── 04-encapsulation-bank-account/
├── 05-inheritance-composition/
├── 06-polymorphism-shapes/
├── 07-interfaces/
├── 08-collections-contact-book/
├── 09-equals-hashcode/
├── 10-generics-comparators/
├── 11-exceptions/
├── 12-library-management/
├── 13-parking-lot/
├── tests/
└── README.md
```

**Git habit:** make one meaningful commit per task, for example `feat: add bank account validation` or `test: cover invalid withdrawal`. Never commit API keys, personal data or generated build folders.

---

# Phase 1 — Arrays, Hashing & Prefix Sums

**Patterns:** frequency maps, complement lookup, running state, prefix sums and Kadane's algorithm.

- [ ] [Two Sum](https://leetcode.com/problems/two-sum/) — HashMap complement lookup  
  ↳ CF warm-up: [Theatre Square](https://codeforces.com/problemset/problem/1/A)
- [ ] [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) — HashSet membership  
  ↳ CF warm-up: [Boy or Girl](https://codeforces.com/problemset/problem/236/A)
- [ ] [Valid Anagram](https://leetcode.com/problems/valid-anagram/) — Frequency counting  
  ↳ CF warm-up: [Word](https://codeforces.com/problemset/problem/59/A)
- [ ] [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) — Minimum-so-far  
  ↳ CF warm-up: [Maximum Increase](https://codeforces.com/problemset/problem/702/A)
- [ ] [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) — Kadane's algorithm  
  ↳ CF warm-up: [Maximum Increase](https://codeforces.com/problemset/problem/702/A)
- [ ] [Majority Element](https://leetcode.com/problems/majority-element/) — Boyer–Moore voting  
  ↳ CF warm-up: [Boy or Girl](https://codeforces.com/problemset/problem/236/A)
- [ ] [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) — Prefix/suffix products  
  ↳ CF practice: [Kuriyama Mirai's Stones](https://codeforces.com/problemset/problem/433/B)
- [ ] [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) — Prefix sum + frequency map  
  ↳ CF practice: [Kuriyama Mirai's Stones](https://codeforces.com/problemset/problem/433/B)

---

# Phase 2 — Sorting, Two Pointers & Sliding Window

**Patterns:** in-place compaction, sorted two pointers, duplicate handling, variable windows and interval merging.

- [ ] [Move Zeroes](https://leetcode.com/problems/move-zeroes/) — Stable in-place compaction  
  ↳ CF practice: [Twins](https://codeforces.com/problemset/problem/160/A)
- [ ] [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) — Opposite-end pointers  
  ↳ CF warm-up: [Word](https://codeforces.com/problemset/problem/59/A)
- [ ] [Two Sum II — Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) — Sorted two pointers  
  ↳ CF warm-up: [Helpful Maths](https://codeforces.com/problemset/problem/339/A)
- [ ] [3Sum](https://leetcode.com/problems/3sum/) — Sort + two pointers + duplicate handling  
  ↳ CF warm-up: [Helpful Maths](https://codeforces.com/problemset/problem/339/A)
- [ ] [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) — Greedy pointer movement  
  ↳ CF practice: [Twins](https://codeforces.com/problemset/problem/160/A)
- [ ] [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) — Variable sliding window  
  ↳ CF practice: [Queue at the School](https://codeforces.com/problemset/problem/266/B)
- [ ] [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) — Shrinkable sliding window  
  ↳ CF practice: [New Year and Hurry](https://codeforces.com/problemset/problem/750/A)
- [ ] [Merge Intervals](https://leetcode.com/problems/merge-intervals/) — Sort + interval merge  
  ↳ CF practice: [Arrival of the General](https://codeforces.com/problemset/problem/567/A)

---

# Phase 3 — Binary Search

**Patterns:** lower bounds, boundary search, rotated arrays and binary search on a monotonic feasibility function.

- [ ] [Binary Search](https://leetcode.com/problems/binary-search/) — Classic sorted search  
  ↳ CF practice: [Presents](https://codeforces.com/problemset/problem/136/A)
- [ ] [Search Insert Position](https://leetcode.com/problems/search-insert-position/) — Lower-bound pattern  
  ↳ CF practice: [Registration System](https://codeforces.com/problemset/problem/4/C)
- [ ] [First Bad Version](https://leetcode.com/problems/first-bad-version/) — Find first true boundary
- [ ] [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) — Identify the sorted half  
  ↳ CF practice: [Dragons](https://codeforces.com/problemset/problem/230/A)
- [ ] [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) — Find the pivot
- [ ] [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) — Binary search on answer  
  ↳ CF practice: [New Year and Hurry](https://codeforces.com/problemset/problem/750/A)
- [ ] [Capacity To Ship Packages Within D Days](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/) — Monotonic feasibility  
  ↳ CF practice: [Packing Rectangles](https://codeforces.com/problemset/problem/1478/A)
- [ ] [Find Peak Element](https://leetcode.com/problems/find-peak-element/) — Slope-based binary search  
  ↳ CF practice: [Maximum Increase](https://codeforces.com/problemset/problem/702/A)

---

# Phase 4 — Recursion & Backtracking

**Patterns:** base cases, recursion trees, choose–explore–undo, pruning and binary exponentiation.

- [ ] [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) — Base cases and recursion tree  
  ↳ CF practice: [Domino Piling](https://codeforces.com/problemset/problem/50/A)
- [ ] [Pow(x, n)](https://leetcode.com/problems/powx-n/) — Binary exponentiation
- [ ] [Subsets](https://leetcode.com/problems/subsets/) — Include/exclude decisions
- [ ] [Combination Sum](https://leetcode.com/problems/combination-sum/) — Reusable choices and backtracking
- [ ] [Permutations](https://leetcode.com/problems/permutations/) — Visited array or swap-based recursion
- [ ] [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) — Branching paths
- [ ] [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) — Constraint-based pruning
- [ ] [Word Search](https://leetcode.com/problems/word-search/) — Grid backtracking and undoing visited state

---

# Phase 5 — Linked Lists, Stacks & Queues

**Patterns:** pointer rewiring, dummy nodes, fast/slow pointers, monotonic stacks and deques.

- [ ] [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) — Three-pointer reversal
- [ ] [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) — Dummy head and pointer movement
- [ ] [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) — Floyd's fast/slow pointers
- [ ] [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) — Two pointers with a gap
- [ ] [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) — Stack matching
- [ ] [Min Stack](https://leetcode.com/problems/min-stack/) — Track minimum in O(1)
- [ ] [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) — Monotonic stack
- [ ] [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) — Monotonic deque

---

# Phase 6 — Trees & Heaps

**Patterns:** DFS, BFS, recursion state, BST bounds, priority queues and top-K selection.

- [ ] [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) — DFS recursion
- [ ] [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) — Recursive transformation
- [ ] [Same Tree](https://leetcode.com/problems/same-tree/) — Paired recursive traversal
- [ ] [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) — BFS queue
- [ ] [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) — Postorder and subtree state
- [ ] [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) — Global lower/upper bounds
- [ ] [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) — Heap or quickselect
- [ ] [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) — Frequency map + heap/buckets

---

# Phase 7 — Graphs

**Patterns:** adjacency lists, visited state, connected components, multi-source BFS, topological sorting and Dijkstra.

- [ ] [Find if Path Exists in Graph](https://leetcode.com/problems/find-if-path-exists-in-graph/) — Adjacency list + DFS/BFS
- [ ] [Number of Islands](https://leetcode.com/problems/number-of-islands/) — Grid components
- [ ] [Flood Fill](https://leetcode.com/problems/flood-fill/) — DFS/BFS on a grid
- [ ] [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/) — Multi-source BFS
- [ ] [01 Matrix](https://leetcode.com/problems/01-matrix/) — Multi-source shortest distance
- [ ] [Clone Graph](https://leetcode.com/problems/clone-graph/) — DFS + old-to-new map
- [ ] [Course Schedule](https://leetcode.com/problems/course-schedule/) — Cycle detection / topological sort
- [ ] [Network Delay Time](https://leetcode.com/problems/network-delay-time/) — Dijkstra + priority queue

---

# Phase 8 — Greedy & Dynamic Programming

**Patterns:** greedy reachability, DP state transitions, take/skip decisions, unbounded DP and grid DP.

- [ ] [Jump Game](https://leetcode.com/problems/jump-game/) — Greedy reachability
- [ ] [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) — Kadane's algorithm as a DP state
- [ ] [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) — 1D DP / Fibonacci state
- [ ] [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) — State transition
- [ ] [House Robber](https://leetcode.com/problems/house-robber/) — Take or skip
- [ ] [Coin Change](https://leetcode.com/problems/coin-change/) — Minimum-count unbounded DP
- [ ] [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) — DP then binary-search optimization
- [ ] [Unique Paths](https://leetcode.com/problems/unique-paths/) — Grid DP

---

# Phase 9 — Bit Manipulation & Design

**Patterns:** XOR cancellation, bit counting, bit DP, tries and composing data structures.

- [ ] [Single Number](https://leetcode.com/problems/single-number/) — XOR cancellation  
  ↳ CF practice: [XORwice](https://codeforces.com/problemset/problem/1427/A)
- [ ] [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) — Bit count and `n & (n - 1)`
- [ ] [Counting Bits](https://leetcode.com/problems/counting-bits/) — Bit DP
- [ ] [Reverse Bits](https://leetcode.com/problems/reverse-bits/) — Shift and mask
- [ ] [LRU Cache](https://leetcode.com/problems/lru-cache/) — HashMap + doubly linked list
- [ ] [Design Twitter](https://leetcode.com/problems/design-twitter/) — API design + feed merging
- [ ] [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/) — Prefix lookup
- [ ] [Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/) — Trie + wildcard backtracking

---

## 🧠 Definition of Done

A problem is complete only when:

- [ ] I can explain the approach before coding.
- [ ] I can write the Java solution from a blank file.
- [ ] I can justify correctness and state time/space complexity.
- [ ] I tested edge cases and handled overflow where relevant.
- [ ] I can recognize when the same pattern applies to a new problem.

## 📅 Weekly Review

- [ ] Re-solve two earlier problems without notes.
- [ ] Write down one pattern learned and one mistake made.
- [ ] Review time and space complexity.
- [ ] Make a small, meaningful GitHub commit.
- [ ] Choose the next topic based on understanding—not question count.

## 🔗 References

- [Striver's A2Z DSA Sheet — takeUforward](https://takeuforward.org/prep-hub/strivers-a2z-dsa-sheet)
- [LeetCode](https://leetcode.com/)
- [Codeforces Problemset](https://codeforces.com/problemset)

> This is a condensed, curated roadmap inspired by Striver's topic progression, not a verbatim reproduction of the full sheet. Codeforces pairings are supplementary practice and may not teach the exact same pattern as their paired LeetCode question.

<div align="center">

**One pattern at a time. One clean implementation at a time. Keep building.** 💻

</div>
