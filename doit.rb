#!/usr/bin/ruby

puts "Running " + ARGV[0] + " times."

for i in 0..ARGV[0].to_i
  `curl localhost:8080/`
  puts i
end
