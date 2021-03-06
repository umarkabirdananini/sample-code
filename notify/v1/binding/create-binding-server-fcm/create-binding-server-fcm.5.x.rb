# Download the helper library from https://www.twilio.com/docs/ruby/install
require 'rubygems'
require 'twilio-ruby'

# Your Account Sid and Auth Token from twilio.com/console
account_sid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
auth_token = 'your_auth_token'
@client = Twilio::REST::Client.new(account_sid, auth_token)

binding = @client.notify.services('ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX')
                        .bindings
                        .create(
                           endpoint: 'XXXXXXXXXXXXXXX',
                           tag: 'preferred device',
                           identity: '00000001',
                           binding_type: 'fcm',
                           address: 'fcm_device_token'
                         )

puts binding.sid
